public class Notebook {
// // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// // Создать множество ноутбуков.
// // Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// // Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// // 1 - ОЗУ
// // 2 - Объем ЖД
// // 3 - Операционная система
// // 4 - Цвет …
// // Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// // Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
    private String name;
    private String color;
    private int hdd;
    private String oSystem;    
    private int cpu;

public Notebook(String name, int hdd, String oSystem, String color) {
    this.name = name;
    this.hdd = hdd;
    this.oSystem = oSystem;
    this.color = color;
}


public String getName() {
    return name;
}   
public String getColor() {
    return color;
}
public int getCpu() {
    return cpu;
}
public int getHdd() {
    return hdd;
}
public String getoSystem() {
    return oSystem;
}
public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    return "name: " + name + ", hdd: " + hdd + ", oSystem: " + oSystem;
}


}
