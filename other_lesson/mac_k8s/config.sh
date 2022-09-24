#! /usr/bin/env bash
#Kubectl
#swap 해제
sudo swapoff -a && sed -i '/swap/s/^/#/' /etc/fstab
sudo modprobe br_netfilter
# Set up required sysctl params, these persist across reboots.
sudo cat <<EOF >  /etc/sysctl.d/k8s.conf
net.bridge.bridge-nf-call-ip6tables = 1
net.bridge.bridge-nf-call-iptables = 1
EOF
sudo modprobe br_netfilter

sudo sysctl --system



#호스트 
sudo bash -c 'cat >> /etc/hosts << EOF
192.168.1.10 m-k8s
192.168.1.101 w1-k8s
192.168.1.102 w2-k8s
EOF
'

#name 서버 설정

sudo cat <<EOF > /etc/resolv.conf

nameserver 1.1.1.1 #cloudflare DNS

nameserver 8.8.8.8 #Google DNS

EOF


sudo ufw disable
