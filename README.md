Connecter avec postgres client:
sudo -u postgres psql
    nach eine Datenbank:
    sudo -u postgres psql -d bad

Afficher bases des donnees:
SELECT datname FROM pg_database;

## Docker
# Docker image machen
docker build -t bad-backend:latest .
# Spring Profil zu docker hinzufugen
docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE=<profiles> bad-backend:latest