import java.util.InputMismatchException;
import java.util.Scanner;
public class Main2Envolvente{

    static Scanner leer = new Scanner(System.in);
    static boolean reiniciar = true;
    public static void main(String[] args){
        
        while(reiniciar){
        instrucciones();
        int opc = leer.nextInt();
        menu(opc);

         System.out.println("De sea reiniciar el programa ?");
        String respuesta = leer.nextLine();
       
        if(respuesta.equalsIgnoreCase("no")){

            reiniciar=false;
        }
    }
        
        }
    

    //instrucciones
    public static void instrucciones(){
        System.out.print("\n 1.Prisma \n 2.Cilindro \n 3.Piramide \n 4.Cono \n 5.Esfera \n 6.Zona y Casquete esferico \n 7.Tronco cono");
        System.out.print("\n 8.Tronco piramide \n 9.Huso y cuna esferico \n 10.Tetaedro \n 11.Hexaedro \n 12.Octoaedro \n 13.Dodecaedro");
        System.out.print("\n 14.Icosaedro \n 15.Ortoedro \n 16.Salir");
    }
    //menu
    public static void menu(int opc){

        switch (opc) {
            case 1:

            areaLateralPrisma();
            areaTotalPrisma();
            volumenTotalPrisma();
                break;
            
            case 2:

                areaLateralCilindro();
                areaTotalCilindro();
                volumenTotalCilindro();
                break;

            case 3:
                areaLateralPiramide();
                areaTotalPiramide();
                volumenTotalPiramide();
                
                break;

            case 4:

                areaLateralCono();
                areaTotalCono();
                volumenTotalCono();
                
                break;

            case 5:

                esfera();
                break;

            case 6:

                zonaEsferica();
                casqueteEsferico();
                
                break;

            case 7:

                troncoCono();
                
                break;

            case 8:

                troncoPiramide();
                
                break;
                
            case 9:

                husoEsferico();
                CunaEsferica();
                
                break;

            case 10:

                tetraedo();
                
                break;

            case 11:

                hexaedro();
                
                break;

            case 12:

                octoaedro();
                
                break;

            case 13:

                dodecaedro();
                
                break;

            case 14:

                icosaedro();
                
                break;

            case 15:
        
            ortoedro();
                
                break;

            case 16:

            System.out.println("Saliendo del programa");
                
                break;

            default:
            System.out.println("Valores invalidos");
            System.out.println("Saliendo del programa ");
                break;
        }

    }

    static int intentos =3;

    public static int pedirLados(int lados){
     
        int numero;

            for (int i = 0; i < intentos; i++) {
                System.out.print("Ingresa un numero entre 3 y 9: ");
                if (leer.hasNextInt()) {
                    numero = leer.nextInt();
                    if (numero >=3 && numero <=9) {
                        return numero;
                    } else {
                        System.out.println("Numero fuera del rango. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Entrada no valida. Ingresa un número entero.");
                    leer.next(); // Limpiar el buffer de entrada
                }
            }
    
            System.out.println("Has alcanzado el limite de intentos. No se pudo ingresar un numero en el rango especificado.");
            return -1; // Esto indica que no se pudo obtener un número válido.
        }
        

         public static int pedirEnteros(int entero){
     
            int numero;

            for (int i = 0; i < intentos; i++) {
                System.out.print("Ingresa un numero en el rango de 1 a 50 ");
                if (leer.hasNextInt()) {
                    numero = leer.nextInt();
                    if (numero >0 && numero <=50) {
                        return numero;
                    } else {
                        System.out.println("Numero fuera del rango. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Entrada no valida. Ingresa un numero entero.");
                    leer.next(); // Limpiar el buffer de entrada
                }
            }
    
            System.out.println("Has alcanzado el límite de intentos. No se pudo ingresar un número en el rango especificado.");
            return -1; // Esto indica que no se pudo obtener un número válido.
        }
    


        public static double pedirDoubles(double variable) {
            double numero;

            for (int i = 0; i < intentos; i++) {
                System.out.print("Ingresa un numero en el rango de 1 a 50 ");
                if (leer.hasNextInt()) {
                    numero = leer.nextDouble();
                    if (numero >0 && numero <=50) {
                        return numero;
                    } else {
                        System.out.println("Numero fuera del rango. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Entrada no valida. Ingresa un numero entero.");
                    leer.next(); // Limpiar el buffer de entrada
                }
            }
    
            System.out.println("Has alcanzado el límite de intentos. No se pudo ingresar un número en el rango especificado.");
            return -1; // Esto indica que no se pudo obtener un número válido.
        }
    
    static int numLados;
    static double longitud,altura;
    //area lateral de un prisma 
    public static void areaLateralPrisma(){
       
        System.out.println("Cual es el numero de lados del prisma?");
        numLados = pedirEnteros(numLados);
    
        System.out.println("Cual es la longitud del prisma?");
        longitud = pedirDoubles(longitud);
        
        System.out.println("Cual es la altura del prisma?");
        altura = pedirDoubles(altura);
        
        if(numLados <0 && longitud <0 && altura <0 ){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        double pBase=numLados * longitud;
        double areaLaterales = pBase * altura;

        System.out.println("El area lateral es: " +areaLaterales);
        }
        
    }

    static double radio;
    //area lateral de un cilindro 
    public static void areaLateralCilindro(){

        System.out.println("Cual es el radio del cilindro?");
        radio = pedirDoubles(radio);

        System.out.println("Cual es el la altura del cilindro?");
        altura = pedirDoubles(altura);
        
        if(radio <0  && altura <0 ){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double pBase = (2*Math.PI) * radio;
        double areaLaterales = pBase * altura;

        System.out.println("El area lateral es" + areaLaterales);
        }

    }

    static double pBase;
    static double dLados;
    //Area lateral de una piramide 
    public static void areaLateralPiramide(){
                
       
        System.out.println("Cual es el la altura de la piramide?");
        altura = pedirDoubles(altura);
                
        System.out.println("Cual es el la distancia de los lados?");
        dLados = pedirDoubles(dLados);
    
        
        System.out.println("Cual es el perimetro de la base?");
        pBase = pedirDoubles(pBase);
        
        if(dLados<0 && pBase <0 && altura <0 ){
            System.out.println("No has ingresado los valores correctamente");
        }else{

        double apotemaMenor = dLados * 2;
        double apotema = altura * apotemaMenor;
        double areaLaterales = (pBase * apotema) / 2;

        System.out.println("El area lateral es" + areaLaterales);
        }
    }

    //Area lateral de un cono
    public static void areaLateralCono(){
        
        System.out.println("Cual es la altura?");
        altura = pedirDoubles(altura);
        
        System.out.println("Cual es la altura?");
        radio = pedirDoubles(radio);

        System.out.println("Cual es el perimetro de la base?");
        pBase = pedirDoubles(pBase);
       
        if(pBase<0 && radio <0 && altura <0 ){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double generatriz = altura * radio;
        double areaLaterales = (pBase * generatriz) / 2 ;

        System.out.println("El area lateral es " + areaLaterales);
        }
    }

    static double areaLateral,perimetro;
    //area lateral de un prisma
    public static void areaTotalPrisma(){

        System.out.println("Cual es el area lateral");
        areaLateral = pedirDoubles(areaLateral);

        System.out.println("Cual es el perimetro");
        perimetro = pedirDoubles(perimetro);

        System.out.println("Cual es la longitud");
        longitud = pedirDoubles(longitud);
      
        if(perimetro <0 && longitud <0 && areaLateral <0 ){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double alfa = 72;
        double apotema = 2 * (Math.tan(alfa) /2);
        double aBase = (perimetro * apotema) / 2;
        double areaTotal = areaLateral + (2 * aBase);

        System.out.println("El area total es " + areaTotal);
        }
    }

    //Area total de un cilindro
    public static void areaTotalCilindro(){
       
        System.out.println("Cual es el radios?");
        radio = pedirDoubles(radio);

        System.out.println("Cual es el area lateral?");
        areaLateral = pedirDoubles(areaLateral);
        
        if(radio <0 && areaLateral <0 ){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double aBase = Math.PI * Math.pow(radio, 2);
        double areaTotal = areaLateral + (2 * aBase);

        System.out.println("El area total es " + areaTotal);
        }
    }

    static double aBase;
    //area total de una piramide
    public static void areaTotalPiramide(){
        
        System.out.println("Cual es el area lateral?");
        areaLateral = pedirDoubles(areaLateral);
    
        System.out.println("Cual es el area de la base?");
        aBase = pedirDoubles(aBase);
       
        if(aBase <0 && areaLateral <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double areaTotal = areaLateral + aBase;

        System.out.println("El area total es " +areaTotal);
        }
    }

    //Area total de  un cono
    public static void areaTotalCono(){
    
        System.out.println("Cual es el area lateral?");
        areaLateral = pedirDoubles(areaLateral);
     
        System.out.println("Cual es el radio?");
        radio = pedirDoubles(radio);
       
        if(areaLateral <0 && radio <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double aBase = Math.PI * Math.pow(radio,2);
        double areaTotal = areaLateral + aBase;

        System.out.println("El area lateral es " +areaTotal);
        }
    }

    //volumen total de un prisma
    public static void volumenTotalPrisma(){
        
        System.out.println("Cual es el perimetro?");
        perimetro = pedirDoubles(perimetro);
                
        System.out.println("Cual es la altura?");
        altura = pedirDoubles(altura);
        
        if(perimetro <0 && altura <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double alfa = 72;
        double apotema = 2 * (Math.tan(alfa)/2);
        double aBase = (perimetro * apotema) / 2;
        double volumenTotal = aBase * altura;

        System.out.println("El volumen total es " + volumenTotal);
        }
    }

    //Volumen total de un cilindro
    public static void volumenTotalCilindro(){

        
        System.out.println("Cual es el radio?");
        radio = pedirDoubles(radio);

        System.out.println("Cual es la altura?");
        altura = pedirDoubles(altura);
        
        if(radio <0 && altura <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double volumenTotal = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen total es:" +volumenTotal);
        }
    }

    //Volumen total de una piramide 
    public static void volumenTotalPiramide(){
 
        System.out.println("Cual es la altura?");
        altura = pedirDoubles(altura);
       
        System.out.println("Cual es el area de la base?");
        aBase = pedirDoubles(aBase);
        
        if(altura <0 && aBase <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double volumenTotal = (aBase * altura) / 3;

        System.out.println("El volumen total es:" +volumenTotal);
        }
    }

    //volumen total de un cono
    public static void volumenTotalCono(){
 
        System.out.println("Cual es la altura?");
        altura = pedirDoubles(altura);
    
        System.out.println("Cual es el area de la base?");
        aBase = pedirDoubles(aBase);
        
        if(altura <0 && aBase <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double volumenTotal = (aBase * altura) / 3;

        System.out.println("El volumen total es:" +volumenTotal);
        }
    }

    //se calculara el area y volumen de una esfera
    public static void esfera(){

        double volumenEsfera;

        System.out.println("Se calculara el area de una esfera");
    
        System.out.println("Cual es el radio ");
        radio = pedirDoubles(radio);
                    
        if(radio <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        double area = 4 * Math.PI * Math.pow(radio, 2);
    
        System.out.println("El area es " + area);
        }

        System.out.println("");

        System.out.println("Se calculara el volumen de una esfera ");
        
        System.out.println("Cual es el radio");
        radio = pedirDoubles(radio);
        

        if(radio <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        volumenEsfera = (1.33) * Math.PI * Math.pow(radio, 3);

        System.out.println("El voluman de la esfera es " + volumenEsfera);
        }
    }

    //zona esferica
     static double areaZonaEsferica, radioMayor, volumenZonaEsferica;

    public static void zonaEsferica(){

        System.out.println("Se calculara el area de una zona esferica");
        
        System.out.println("cual es el radio");
        radioMayor=pedirDoubles(radioMayor);
       
        System.out.println("cual es la altura");
        altura= pedirDoubles(altura);
        
        if(radioMayor <0 && altura <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        areaZonaEsferica = 2 * Math.PI * radioMayor * altura;

        System.out.println("el area de la zona esferica es " + areaZonaEsferica);
        }

        System.out.println("");

        System.out.println("Se calcura el volumen de la zona esferica ");
       
        System.out.println("Cual es la altura");
        altura=pedirDoubles(altura);

        System.out.println("Cual es el radio");
        radioMayor= pedirDoubles(radioMayor);
        if(altura <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{

        volumenZonaEsferica =( Math.PI * altura * (Math.pow(altura, 2) * (3 * Math.pow(radioMayor, 2)) * (3 * Math.pow(radioMayor,2)))) / 6 ;

        System.out.println("El vomuen de la zona esferica es " + volumenZonaEsferica);
        }    
    }

        // casquete esferico
        public static void casqueteEsferico(){

        double volumenCasqueteEsferico;

        System.out.println("Se calculara el volumen de el casquete esferico");        
    
        System.out.println("Cual es el radio");
        radioMayor=pedirDoubles(radioMayor);
       
        System.out.println("Cual es la altura");
        altura=pedirDoubles(altura);
        if(altura<0 && radioMayor <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
    
        volumenCasqueteEsferico = (Math.PI * altura * ((3 * radioMayor) - altura)) / 3;

        System.out.println("El volumen del casuqete esferico es " + volumenCasqueteEsferico);
        }
    }

    static double areaHusoEsferico;
    //Huso esferico 
    public static void husoEsferico(){

        System.out.println("Se calculara el huso esferico ");

        System.out.println("Cual es radio");
        radio=pedirDoubles(radio);
        
        //hacer un metodo para este 
        do{
        System.out.println("Cual es el numero de grado ");
        numeroDeGrados=pedirDoubles(numeroDeGrados);
        }while(numeroDeGrados<0 || numeroDeGrados>=360);
        if(numeroDeGrados<0 || numeroDeGrados <=360 && radio <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
            
        areaHusoEsferico = (4 * Math.PI * Math.pow(radio, 2) * numeroDeGrados) / 360;

        System.out.println("El huso esferico es " + areaHusoEsferico);
        }
    }

    static double numeroDeGrados=0,volumenCunaEsferica;
    //cuna esferica
    public static void CunaEsferica(){        

        System.out.println("Se calculara la cuna esferica ");
        
        System.out.println("Cual es el radio");
        radio=pedirDoubles(radio);
        
        do{
        System.out.println("Cual es el numero de grado ");
        numeroDeGrados=pedirDoubles(numeroDeGrados);
        }while(numeroDeGrados<0 || numeroDeGrados>=360);

        volumenCunaEsferica = (1.33) * ((Math.PI * Math.pow(radio, 3) * numeroDeGrados )/ 360);
        if(numeroDeGrados<0 || numeroDeGrados <=360 && radio <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{

        System.out.println("El volumen de la cuna esferica es " + volumenCunaEsferica);
        }
    }

    static double  radioMenor=0, generatriz, bBaseMayor=0, bBaseMenor=0, VolumenTroncoCono;
    //Tronco Cono
    public static void troncoCono(){

        System.out.println("Se calculara el area lateral del tronco de un cono");

        System.out.println("Cual es la altura");
        altura=pedirDoubles(altura);

        System.out.println("Cual es el radio menor");
        radioMenor=pedirDoubles(radioMenor);

        System.out.println("Cual es el radio  mayor");
        radioMayor=pedirDoubles(radioMayor);
        if(altura<0 && radioMenor <0 && radioMayor <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        generatriz = radioMenor * altura;
        areaLateral = Math.PI * generatriz * ( radioMayor + radioMenor);

        System.out.println("El area lateral es " + areaLateral);
        }
        System.out.println("");

        System.out.println("se calculara el area total del tronco de un cono ");

        System.out.println("cual es la base menor de b");
        bBaseMenor=pedirDoubles(bBaseMenor);
        
        System.out.println("cual es la base mayor de b");
        bBaseMayor=pedirDoubles(bBaseMayor);
        if(bBaseMayor<0 && bBaseMenor <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{

        areaTotal = areaLateral + bBaseMayor + bBaseMenor;

        System.out.println("El area total es " + areaTotal);
        }
        System.out.println("");

        System.out.println("Se calcular el volumen de el tronco de un cono ");
    
        System.out.println("Cual es la altura");
        altura=pedirDoubles(altura);
            
        System.out.println("Cual es el radio menor");
        radioMenor=pedirDoubles(radioMenor);

        System.out.println("Cual es el radio  mayor");
        radioMayor=pedirDoubles(radioMayor); 
        if(altura<0 && radioMenor <0 && radioMayor <0 ){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        VolumenTroncoCono = ((0.33) * (Math.PI * altura) * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) +radioMayor * radioMenor));
        
        System.out.println("El volumen del tronco del cono es " + VolumenTroncoCono);
        }
    }

   static  double aBaseMenor, pBaseMenor=0, pBaseMayor=0, areaTotal, volumenTroncoPiramide, aBaseMayor, apotemaTroncoPiramide, apotemaBaseMenor=0, apotemaBaseMayor=0;
    //tronco piramide
    public static void troncoPiramide(){

        System.out.println("Se calculara el area lateral del tronco de una piramide ");

        System.out.println("Cual es la base mayor de p");
        pBaseMayor=pedirDoubles(pBaseMayor);
            
        System.out.println("Cual es la base menor de p");
        pBaseMenor=pedirDoubles(pBaseMenor);
                
        System.out.println("Cual es el apotema base menor");
        apotemaBaseMenor=pedirDoubles(apotemaBaseMenor);

        System.out.println("Cual es el apotema base mayor");
        apotemaBaseMayor=pedirDoubles(apotemaBaseMayor);

        System.out.println("Cual es la altura");
        altura=pedirDoubles(altura);
        if(pBaseMayor<0 && pBaseMenor <0 && apotemaBaseMayor <0 && apotemaBaseMenor <0 && altura<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        apotemaTroncoPiramide = Math.sqrt(Math.pow(altura, 2) - Math.pow(apotemaBaseMayor - apotemaBaseMenor, 2) );
        areaLateral = ((pBaseMayor + pBaseMenor) / 2) * apotemaTroncoPiramide;

        System.out.println("El area lateral es " + areaLateral);
        }

        System.out.println("");

        System.out.println("Se calculara el area total del tronco de la piramide");

        System.out.println("Cual es la base mayor de a");
        aBaseMayor=pedirDoubles(aBaseMayor);

        System.out.println("Cual es la base menor de a");
        aBaseMenor=pedirDoubles(aBaseMenor); 
        if(aBaseMayor<0 && aBaseMenor <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        areaTotal = areaLateral + aBaseMayor + aBaseMenor;

        System.out.println("El area total es " + areaTotal);
        }

        System.out.println("");

        System.out.println("Se calculara el volumen de la tronco de la piramide");
       
        System.out.println("Cual es la base mayor de a");
        aBaseMayor=pedirDoubles(aBaseMayor);
        
        System.out.println("Cual es la base menor de a");
        aBaseMenor=pedirDoubles(aBaseMenor);

        System.out.println("Cual es la altura");
        altura=pedirDoubles(altura);
        if(aBaseMayor<0 && aBaseMenor <0 && altura <0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        volumenTroncoPiramide = (0.33) * altura * (aBaseMayor + aBaseMenor + Math.sqrt(aBaseMayor * aBaseMenor));

        System.out.println("El volumen del tronco de la piramide es " + volumenTroncoPiramide);
        }
    }

    static double aristas, area, volumen;

    //tetraedro
    public static void tetraedo(){
        
        System.out.println("Se calculara el area del tetraedro");
    
        System.out.println("Cual es arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        area = Math.pow(aristas, 2) * Math.sqrt(3);

        System.out.println("El area del tetraedo es " + area);
        }

        System.out.println("");

        System.out.println("Se calculara el volumen del tetraedo");

        
        System.out.println("Cual es arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        volumen = (Math.sqrt(2) / 12) * Math.pow(aristas, 3);

        System.out.println("El volumen del tetraedo es " + volumen);
        }

        System.out.println("");

        System.out.println("Se calculara la altura del tetraedo");

        
        System.out.println("Cual es arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        altura = aristas * (Math.sqrt(6) / 3);

        System.out.println("La altura del tetraedo es " + altura);
        }
    }

    static double diagonal;
    //Hexaedro
    public static void hexaedro(){

        System.out.println("Se calculara el area de un hexaedro");

        
        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        area = 6 * Math.pow(aristas, 2);

        System.out.println("el area del hexaedro es " + area);

        }
        System.out.println("");

        System.out.println("Se calculara el volumen de un hexaedro ");
        
        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        volumen = Math.pow(aristas, 3);

        System.out.println("El volumen del hexaedro es " + volumen);
        }

        System.out.println("");

        System.out.println("Se calculara la diagonal de un hexaedro");

        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        diagonal = aristas * Math.sqrt(3);
        
        System.out.println("La diagonal del hexaedro es " + diagonal);
        }
    }
    //Octoaedro
    public static void octoaedro(){

        System.out.println("Se calculara el area de un octaedro");

        System.out.println("Cual es el valor de las aristas");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        area = 2 * Math.pow(aristas, 2) * Math.sqrt(3);

        System.out.println("El area del octaedro es " + area);
        }

        System.out.println("");

        System.out.println("Se calculara el volumen de un octaedro");

        System.out.println("Cual es el valor de las aristas");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{

        volumen = (Math.sqrt(2) / 3) * Math.pow(aristas, 3);

        System.out.println("El volumen de un octaedro es " + volumen);
    }
}

    //Dodecaedro
    public static void dodecaedro(){

        System.out.println("Se calculara el area de un dodecaedro");
       
        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        area = 3 * Math.pow(aristas, 3) * Math.sqrt(25 + 10 * Math.sqrt(5));

        System.out.println("El area de un dodecaedro es " + area);
        }

        System.out.println("");

        System.out.println("Se calculara el volumen de un dodecaedro");

        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        volumen = (0.25) * (15 + 7 * Math.sqrt(5)) * Math.pow(aristas, 3);

        System.out.println("El volumen de un dodecaedro es " + volumen);
        }
    }

    //Icosaedro
    public static void icosaedro(){

        System.out.println("Se calculara el area de icoseadro");

        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{

        area = 5 * Math.pow(aristas, 2) * Math.sqrt(3);

        System.out.println("El area de un icoseadro es " + area);
        }

        System.out.println("");

        System.out.println("Se calculara el volumen de un icoseadro");
        
        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        if(aristas<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{

        volumen = (0.41) * (3 + Math.sqrt(5)) * Math.pow(aristas, 3 );

        System.out.println("El volumen de un icoseadro es " + volumen);
        }
    }

    static double cara, base;
    //Ortoedro
    public static void ortoedro(){

        System.out.println("Se calculara el area de un ortoedro");
            
        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);

        System.out.println("Cual es el valor de la base");
        base=pedirDoubles(base);        
    
        System.out.println("Cual es el valor de la cara");
        cara=pedirDoubles(cara);
        if(aristas<0 && base<0 && cara<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
        
        area = 2 * ((aristas * base) * (aristas * cara) * (base * cara));
    
        System.out.println("El area de un ortoedro es " + area);

        System.out.println("");
        }

        System.out.println("Se calculara el volumen de un ortoedro");
    
        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
    
        System.out.println("Cual es el valor de la base");
        base=pedirDoubles(base);
            
        System.out.println("Cual es el valor de la cara");
        cara=pedirDoubles(cara);
        if(aristas<0 && base<0 && cara<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
       
        volumen = aristas * base * cara;
    
        System.out.println("El volumen de un ortoedro es " + volumen);
    
        System.out.println("");
        }

        System.out.println("Se calculara la diagonal de un ortoedro");
    
        
        System.out.println("Cual es el valor de la arista");
        aristas=pedirDoubles(aristas);
        
        System.out.println("Cual es el valor de la base");
        base=pedirDoubles(base);
        
        System.out.println("Cual es el valor de la cara");
        cara=pedirDoubles(cara);
        if(aristas<0 && base<0 && cara<0){
            System.out.println("No has ingresado los valores correctamente");
        }else{
    
        diagonal = Math.sqrt(Math.pow(aristas + base + cara, 2));
    
        System.out.println("La diagonal de un ortoedero es " + diagonal);
        }
    }
    
}