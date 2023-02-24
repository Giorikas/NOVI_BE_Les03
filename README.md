# Les 03 
<kbd>0.0.0</kbd>


## Inhoud
**[Opdracht](#Opdracht)**
&emsp;&emsp;[Doel en opdracht](#Doel-en-opdracht)
&emsp;[Opdrachtbeschrijving](#Opdrachtbeschrijving)
&emsp;[Randvoorwaarden](#Randvoorwaarden)
&emsp;[Bonus](#Bonus)\
**[Checklists](#Checklists)**
&emsp;&emsp;[Doel en opdracht](#Doel-en-opdracht)
&emsp;[Stappenplan](#Stappenplan)
&emsp;[Randvoorwaarden](#Randvoorwaarden)\
**[Versiebeheer](#Versiebeheer)**\
**[Git cheatsheet](#Git cheatsheet)**



## Opdracht

### Doel en opdracht.
Oefenen met arrays, collecties en loops door het maken van een nummer-vertaler.

### Opdrachtbeschrijving

Je gaat een applicatie bouwen die getallen vertaalt van numeriek (1, 2, 3, etc.) naar alfabetisch (een, twee, drie, etc.).
Je gaat die getallen vertalen door gebruik te maken van een HashMap.
Je zet de numerieke getallen als sleutel (key) en de alfabetische getallen als waarde (value) in de HashMap.
Vervolgens vraag je de gebruiker om een input van 0 tot en met 9 te geven en ga je dat "vertalen" door simpelweg de 
waarde uit de HashMap te vragen met de bijbehorende sleutel
en dat terug te geven aan de gebruiker.

### Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:
- In je main methode staan twee arrays (1 numeriek en 1 alfabetisch), een boolean variabele, een Translator object en een Scanner object;
- Je project bevat 1 Translator class met daarin een HashMap variabele, een constructor met 2 arrays als parameter en een translate functie;
- De logica van de applicatie wordt gedraaid in een while(boolean)-loop in je main methode.

### Bonus
1. maak een methode genaamd "randomNumberGenerator" die een hashset met 4 random nummers returned. _Tip:_ Gebruik een while-loop en de java.util.Random class om random nummers aan de set toe te voegen, zolang de set korter is dan 4.
2. maak een methode die een HashSet als parameter inneemt en een string van 4 nummers returned. _Tip:_ Maak een lege String variable (of StringBuilder). Gebruik een for-loop om door de HashSet te loopen om zo elke element uit de Set toe te voegen aan de String (of StringBuilder).
3. voeg de string van 4 nummers als parameter toe bij het aanroepen van de methode "feedback".
   **Bonus-bonus:** maak de methode zo dat je vaker kan raden.

## Checklist
### Stappenplan
- [ ] Skelet optuigen: Klassen `main` en `Translator`
- [ ] `main` `translator laten aanroepen`; `sout: "Translator aangeroepen"` 
- [ ] Arrays `int[] arrNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}` en `arrStr[] arrNumVoluit = {nul, "één","twee", 
  "drie", "vier", "vijf", "zes", "zeven", acht, negen }` 
  declareren in `main`.
- [ ] methode maken die de arrays samenvoegt tot andere collectie: Hashmap:
```
import java.util.HashMap; // import the HashMap class
HashMap<int, String> keyNumValueNumWritten = new HashMap<int, String>();
```
### Randvoorwaarden
#### Main
- [ ] 2 arrays; getallen en uitgeschreven getallen
- [ ] boolean variabele
- [ ] Translator object 
- [ ] Scanner object
- [ ] Logica draait in Main in een while(boolean)-loop.
#### Project
- [ ] Translator klasse met
  - [ ] HashMap variabele
  - [ ] Constructor met 2 arrays als parameter
  - [ ] Translator functie

### Github
- [ ] Clonen van dit project
- [ ] Nieuwe repository maken en koppelen, en eerste publicatie.
- [ ] Huiswerk-tak maken.
- [ ] Pushen naar huiswerk-tak.
- [ ] Review door medestudent
- [ ] Werk van medestudent reviewen...

## Versiebeheer
<kbd>0.0.0</kbd> Git aangemaakt.

## Git cheatsheet
1.	Link van github kopieëren. en in IDE in nieuw project
      `Project from version control` of `get from VCS`
2. Ontkoppel de remote met `git remote remove origin`. 
3. Nieuwe repository maken en koppelen aan project met `git remote add origin [link naar jou github repo]`
4. Zorg dat je main-branch ook echt "main" heet met `git branch -M main`.
5. Push vervolgens je de (originele) main branch naar je eigen github met `git push -u origin main`.
6. Maak nu een nieuwe huiswerk-branch aan om je huiswerk op te maken met `git checkout -b [naam van je nieuwe tak]`
7. Push hele feature branch naar nieuwe tak. `git push origin [naam van je nieuwe tak]`
8. controleren welke takken er zijn en welke actief is: `git branch`
9. Schakelen tussen takken door: `git checkout [naam van tak]`
10. Commentaren verwerken, daarna `git push origin [naam van tak]`
11. remote op Github mergen.
12. Lokaal bijwerken **vanaf de main**:
    1. Ga naar main: `git checkout main`
    2. Haal nwe master op: `git pull origin main`
    3. Verwijder tak: `git branch -d [naam van tak]`
 


