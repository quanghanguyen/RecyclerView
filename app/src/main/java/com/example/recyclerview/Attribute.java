package com.example.recyclerview;

public class Attribute {

    // Nếu set ảnh thì thêm thuộc tính resourceId
    private int resourceId;

    public Attribute(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
