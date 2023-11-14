document.getElementById("login__form").addEventListener("submit", function(event) {
    event.preventDefault(); // Empêcher le comportement par défaut du formulaire (rechargement de la page)
 
    // Récupérer les valeurs des champs
    var email = document.getElementById("login-email").value;
    var password = document.getElementById("login-pass").value;
 
    // Afficher les valeurs dans la console
    console.log("Email: " + email);
    console.log("Password: " + password);
 
 });

