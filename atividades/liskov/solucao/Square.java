class Square extends Result {

    protected int width;
   
    public void setWidth(int width) {
        this.width = width;
    }

   @Override
    public int calculateArea() {
        return width * width;
    }
}