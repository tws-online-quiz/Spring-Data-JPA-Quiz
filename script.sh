#!/usr/bin/env bash
service mysql start
mysql -uroot -proot
create database employee_db;
exit;
./gradlew test