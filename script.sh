#!/usr/bin/env bash
service mysql start
mysql -uroot -proot
create database employee_db;
show databases;
exit;
./gradlew test