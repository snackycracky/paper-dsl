user@ubuntu:/var/log$ sudo sed '/sshd/!d' auth.log | grep
Accepted | awk '{print $1, $2, $3, $9, $11}'
Dec 17 13:50:51 root 192.168.7.81
Dec 18 12:55:09 root 192.168.7.81