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
# Docker image hochladen zur Digital Ocean registry
1. doctl registry login
2. docker tag bad-backend:latest registry.digitalocean.com/bad-backend/bad-backend:latest
3. docker push registry.digitalocean.com/bad-backend/bad-backend:latest

## Digital Ocean
FRAGE:
I deployed a docker images containing a spring boot application on the App Platform on Digital Ocean. How can I access it? 
Is the deployment given an ip address that I can access externally? If so, where can I find it?

ANTWORT CHATGPT: 
When you deploy a Docker image containing a Spring Boot application on the App Platform in DigitalOcean, the platform automatically handles the deployment and exposes your app via a URL or domain, rather than giving you a direct IP address to access externally. Here’s how you can access it:

URL or Custom Domain:

By default, DigitalOcean App Platform provides your deployed application with a subdomain under app.deployment.doserver.net (this might be a variation depending on the platform version).
If you didn’t specify a custom domain during the setup, you'll receive a public URL in the form https://your-app-name.ondigitalocean.app.
You can find this URL in the DigitalOcean Dashboard under the "App Platform" section, in the overview of your app deployment.
Steps to find the URL:

Go to the DigitalOcean Dashboard.
Navigate to App Platform.
Find your application in the list.
In the details of the app, you should see a URL that you can access directly. If you haven’t set up a custom domain, this URL will be something like https://your-app-name.ondigitalocean.app.
Custom Domain:

If you set up a custom domain, you can access your Spring Boot application via the domain name you provided.
The app platform allows you to link your custom domain by pointing it to the correct DNS record provided by DigitalOcean.
Ports:

Make sure your Spring Boot app inside the Docker container is listening on the correct port. 
By default, Spring Boot applications listen on port 8080, but if your Docker image is configured differently, ensure that the correct port is exposed.

Accessing the App:

If you're using the default DigitalOcean domain, open the provided URL in your browser (e.g., https://your-app-name.ondigitalocean.app).
If you configured a custom domain, access your app through that domain.
Troubleshooting:
If you don't see the URL in your dashboard or it isn't accessible, check if the deployment is successful and the service is running. 
You may also want to ensure that the app is correctly configured to expose the necessary ports and that no firewall settings are blocking the traffic.
ENDE ANTWORT CHATGPT
## Remet en place une docker image
Attention, en quelque sorte telecharger une nouvelle docker images avec la meme tag qu'est la deja, ne resulte pas 
d'une nouvelle version, quand on mettre en place le tag de nouveau.  