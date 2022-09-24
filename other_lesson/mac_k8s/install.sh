 #! /usr/bin/env bash
 #vim 설치
 sudo apt-get install vim

#도커 설치
 sudo apt-get update

 sudo apt-get install \
    ca-certificates \
    curl \
    gnupg \
    lsb-release

	 sudo mkdir -p /etc/apt/keyrings
	sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg


echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null


sudo apt-get update

sudo apt-cache madison docker-ce

sudo apt-get install docker-ce docker-ce-cli containerd.io docker-compose-plugin

sudo service docker start
sudo systemctl enable --now docker

sudo mkdir /etc/docker
sudo cat <<EOF | sudo tee /etc/docker/daemon.json
{
  "exec-opts": ["native.cgroupdriver=systemd"],
  "log-driver": "json-file",
  "log-opts": {
    "max-size": "100m"
  },
  "storage-driver": "overlay2"
}
EOF

#crio install
OS=xUbuntu_20.04
VERSION=1.25

# Add Kubic Repo
echo "deb https://download.opensuse.org/repositories/devel:/kubic:/libcontainers:/stable/$OS/ /" | tee /etc/apt/sources.list.d/devel:kubic:libcontainers:stable.list

# Import Public Key
sudo curl -L https://download.opensuse.org/repositories/devel:/kubic:/libcontainers:/stable/$OS/Release.key | apt-key add -

# Add CRI Repo
sudo echo "deb http://download.opensuse.org/repositories/devel:/kubic:/libcontainers:/stable:/cri-o:/$VERSION/$OS/ /" | tee /etc/apt/sources.list.d/devel:kubic:libcontainers:stable:cri-o:$VERSION.list

# Import Public Key
sudo curl -L https://download.opensuse.org/repositories/devel:kubic:libcontainers:stable:cri-o:$VERSION/$OS/Release.key | apt-key add -


sudo apt update
sudo apt install cri-o cri-o-runc cri-tools -y

sudo systemctl enable --now crio.service


sudo systemctl start crio.service

sudo crictl info



sudo apt-get update
sudo curl -fsSLo /usr/share/keyrings/kubernetes-archive-keyring.gpg https://packages.cloud.google.com/apt/doc/apt-key.gpg
echo "deb [signed-by=/usr/share/keyrings/kubernetes-archive-keyring.gpg] https://apt.kubernetes.io/ kubernetes-xenial main" | sudo tee /etc/apt/sources.list.d/kubernetes.list

sudo apt-get update
sudo apt-get install -y kubelet kubeadm kubectl
sudo apt-mark hold kubelet kubeadm kubectl

sudo systemctl daemon-reload
sudo systemctl start kubelet && systemctl enable --now kubelet
sudo systemctl restart kubelet

sudo systemctl daemon-reload 
sudo systemctl restart docker