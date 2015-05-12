grammar Topaze;

parse: block EOF;

block: instruction*;

instruction
: affichage
| initialisation;

affichage:
    'afficher' WS texte=ChaineEntreParentheses ('.' | WS '.');

initialisation:
    nom=NomVariable WS 'vaut' WS valeur=Int ('.' | WS '.');

ChaineEntreParentheses:  '"' ('""' | ~'"')* '"';
NomVariable: ('A'..'Z' | 'a'..'z')('A'..'Z' | 'a'..'z' | Int | '_')*;

WS: (' ' | '\t')+;
Int : ('0'..'9')+;