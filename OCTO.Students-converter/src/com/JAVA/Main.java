    package com.JAVA;

    import javax.swing.JDialog;
    import javax.swing.JOptionPane;

    public class Main {

    public static void main(String[] args) {
        JDialog.setDefaultLookAndFeelDecorated(true);

        String[] selectionValues = {"USD", "EUR", "RUB", "KWD", "BHD", "OMR", "JOD", "GBP", "KYD", "CHF"};

        String initialSelection = "Currency";

        String selection = (String) JOptionPane.showInputDialog(null, "Какая валюта вам нужна?",
                "Обмен валют", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        String userCurrency = (String) JOptionPane.showInputDialog(null, "Какую валюту предложите?",
                "Обмен валют", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        double cource = Double.parseDouble(JOptionPane.showInputDialog("Какой курс " + userCurrency + " относительно " + selection + " ?" + "\n" + "1" + userCurrency + " ="));

        double amount = Double.parseDouble(JOptionPane.showInputDialog("Сколько " + userCurrency + " вы собираетесь обменять?"));

        JOptionPane.showMessageDialog(null, "При конвертации" + amount + userCurrency + " в " + selection + " Вы получите " + (cource * amount) + selection);

    }
}
/*
Дороботать ошибки
Добавить map
 Динары Кувейта (KWD)
Динары Бахрейна (BHD)
Риалы Омана (OMR)
Динар Иордании (JOD)
Фунт стерлингов Великобритании(GBP)
Доллар Каймановых островов (KYD)
Европейский евро (EUR)
Франки Швейцарии (CHF)
 Правила написания кода
  4 пробела от края в начале строчки в -->
 1 пробел в низ
 */