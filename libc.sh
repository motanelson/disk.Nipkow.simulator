#!/usr/bin/sh 
printf "\033c\033[43;30m\ndownloa gcc"
wget "https://ftp.gnu.org/gnu/glibc/glibc-2.41.tar.gz" 
gzip -d 'glibc-2.41.tar.gz'
tar --extract -f 'glibc-2.41.tar'
cd glibc-2.41
 