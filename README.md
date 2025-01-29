Connecter avec postgres client:
sudo -u postgres psql
    nach eine Datenbank:
    sudo -u postgres psql -d bad

Afficher bases des donnees:
SELECT datname FROM pg_database;