package model;

/**
 * Created by christine on 2017/7/9.
 */
public class SVM {
    private String date;
    private double price_true;
    private double price_predict;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice_true() {
        return price_true;
    }

    public void setPrice_true(double price_true) {
        this.price_true = price_true;
    }

    public double getPrice_predict() {
        return price_predict;
    }

    public void setPrice_predict(double price_predict) {
        this.price_predict = price_predict;
    }
}
