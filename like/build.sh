docker pull mysql:8.0.30
docker run -itd --name mysql-test -p 3806:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql:8.0.30
mysql -h localhost -P3806 -u root -p