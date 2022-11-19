public class Main2 {
    public static void main(String[] args) {
        Car grande = new Car();
        grande.brand = "Lada";
        grande.model = "Grande";
        grande.productionYear = 2015;
        grande.produtionCountry = "Россия";
        grande.color = "желтый";
        grande.engineVolume = 1.7;
        System.out.println("Марка" + grande.brand + ". Модель машины " + grande.model+ ". Год выпуска" + grande.productionYear+ "сборка в" + grande.produtionCountry+ "цвет кузова" + grande.color + "объем двигателья" + grande.engineVolume);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50L TDI";
        audi.productionYear = 2020;
        audi.produtionCountry = "Германия";
        audi.color = "черный";
        audi.engineVolume = 3.0;
        System.out.println("Марка" + audi.brand + ". Модель машины " + audi.model+ ". Год выпуска" + audi.productionYear+ "сборка в" + audi.produtionCountry+ "цвет кузова" + audi.color + "объем двигателья" + audi.engineVolume);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.produtionCountry = "Германия";
        bmw.color = "черный";
        bmw.engineVolume = 3.0;
        System.out.println("Марка" + bmw.brand + ". Модель машины " + bmw.model+ ". Год выпуска" + bmw.productionYear+ "сборка в" + bmw.produtionCountry+ "цвет кузова" + bmw.color + "объем двигателья" + bmw.engineVolume);


        Car kia = new Car();
        kia.brand = "KIA";
        kia.model = "Sportage 4";
        kia.productionYear = 2018;
        kia.produtionCountry = "Южное Корея";
        kia.color = "красный";
        kia.engineVolume = 2.4;
        System.out.println("Марка" + kia.brand + ". Модель машины " + kia.model+ ". Год выпуска" + kia.productionYear+ "сборка в" + kia.produtionCountry+ "цвет кузова" + kia.color + "объем двигателья" + kia.engineVolume);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.produtionCountry = "Южное Корея";
        hyundai.color = "оранжевый";
        hyundai.engineVolume = 1.6;
        System.out.println("Марка" + hyundai.brand + ". Модель машины " + hyundai.model+ ". Год выпуска" + hyundai.productionYear+ "сборка в" + hyundai.produtionCountry+ "цвет кузова" + hyundai.color + "объем двигателья" + hyundai.engineVolume);


    }
}


