package com.kkh.factory;

class iPhone {
    private String model;
    private String color;
    private int storageCapacity;

    public iPhone(String model, String color, int storageCapacity) {
        this.model = model;
        this.color = color;
        this.storageCapacity = storageCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String toString() {
        return "모델 : " + model + " (" + color + ", " + storageCapacity + "GB)";
    }
}