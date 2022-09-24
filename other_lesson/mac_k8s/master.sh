#! /usr/bin/env bash
# init kubernetes 
sudo kubeadm init --token 123456.1234567890123456 --token-ttl 0 --pod-network-cidr=172.16.0.0/16 --apiserver-advertise-address=192.168.1.10  --cri-socket /var/run/crio/crio.sock --ignore-preflight-errors=mem

# config for master node only 
sudo sudo mkdir -p $HOME/.kube
sudo cp -i /etc/kubernetes/admin.conf $HOME/.kube/config
sudo chown $(id -u):$(id -g) $HOME/.kube/config

sudo curl https://raw.githubusercontent.com/Gros19/Study/Gros/other_lesson/mac_k8s/calico.yaml -ONs --insecure
sudo kubectl apply -f calico.yaml
