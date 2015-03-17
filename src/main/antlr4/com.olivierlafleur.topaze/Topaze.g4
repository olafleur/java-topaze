grammar Topaze;

topaze:
    nom=Nom WS 'vaut' WS valeur=Int '.';

Nom: ('A'..'Z' | 'a'..'z')+;

WS: (' ' | '\t')+;
Int : ('0'..'9')+;