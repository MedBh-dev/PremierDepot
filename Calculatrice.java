package Git;

//Classe Calculatrice
class Calculatrice {
// M�thode d'addition
public double addition(double a, double b) {
   return a + b;
}

// M�thode de soustraction
public double soustraction(double a, double b) {
   return a - b;
}

// M�thode de multiplication
public double multiplication(double a, double b) {
   return a * b;
}

// M�thode de division avec gestion de l'erreur de division par z�ro
public double division(double a, double b) {
   if (b == 0) {
       throw new ArithmeticException("Erreur : Division par z�ro.");
   }
   return a / b;
}
}
