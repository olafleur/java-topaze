grammar Topaze;

initialisation:
    nom=Nom WS 'vaut' WS valeur=Int ('.' | WS '.');

Nom: ('A'..'Z' | 'a'..'z')+;

WS: (' ' | '\t')+;
Int : ('0'..'9')+;