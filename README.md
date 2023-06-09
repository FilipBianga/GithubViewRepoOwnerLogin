# GithubViewRepoOwnerLogin
<hr>
Aplikacja w której podając nazwę użytkownika oraz nagłówek (header : "Accept: application/json") powinniśmy otrzymać w odpowiedzi: 
<br>
<strong> Nazwa repozytorium</strong>
<br>
<strong> Login właściciela </strong>
<br>
<strong> Dla każdej gałęzi jej nazwa i ostatni commit sha </strong>
<br>
<br>
Jezeli podany użytkownik nie istnieje w bazie Github powinniśmy otrzymać odpowiedz 404 w podanym niżej formacie:
<br>
<br>
{
<br>
<br>
"status": ${responseCode}
<br>
"message": ${whyHasItHappened}
<br>
<br>
}
<br>
<br>
Jeżeli odpowiedz w nagłówku xml zamiast json powinniśmy otrzymać kod 406 oraz format:
<br>
<br>
{
<br>
<br>
"status": ${responseCode}
<br>
"message": ${whyHasItHappened}
<br>
<br>
}

Wszelkie zapytania pod adresem lub w Postmanie:
<br>
http://localhost:8080/repos/all?login={nazwaUzytkownika}
<br>
Przykład
<br>
<br>
<img src="src/main/resources/static/img.png">