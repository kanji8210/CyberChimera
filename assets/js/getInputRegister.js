document.getElementById("register__form").addEventListener("submit", function(event) {
    event.preventDefault(); // Empêcher le comportement par défaut du formulaire (rechargement de la page)
 
    // Récupérer les valeurs des champs
    var pseudo = document.getElementById("register-pseudo").value;
    var email = document.getElementById("register-email").value;
    var password = document.getElementById("register-pass").value;
 
    // Afficher les valeurs dans la console
    console.log("pseudo : " + pseudo);
    console.log("Email: " + email);
    console.log("Password: " + password);
 });