grammar Topaze;

parse: block EOF;

block: instruction*;

instruction
: affichage
| initialisation_chaine
| initialisation_entier;

affichage:
    'afficher' WS texte=ChaineEntreParentheses ('.' | WS '.');

initialisation_chaine:
    nom=NomVariable WS 'vaut' WS texte=ChaineEntreParentheses ('.' | WS '.');

initialisation_entier:
    nom=NomVariable WS 'vaut' WS valeur=Int ('.' | WS '.');

ChaineEntreParentheses:  '"' ('""' | ~'"')* '"';
NomVariable: ('A'..'Z' | 'a'..'z')('A'..'Z' | 'a'..'z' | Int | '_')*;

WS: (' ' | '\t')+;
Int : ('0'..'9')+;