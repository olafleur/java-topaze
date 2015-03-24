grammar Topaze;

parse: block EOF;

block: instruction*;

instruction
: affichage
| initialisation;

affichage:
    'afficher' WS '"' texte=Chaine '"' ('.' | WS '.');

initialisation:
    nom=Chaine WS 'vaut' WS valeur=Int ('.' | WS '.');

Chaine: ('A'..'Z' | 'a'..'z')+;

WS: (' ' | '\t')+;
Int : ('0'..'9')+;