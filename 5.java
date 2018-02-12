public static File getIndexLocation(Context ctx) {

    File thisDir = null;
    try {
        thisDir = ctx.getDir("index", Context.MODE_PRIVATE);
         } catch (Exception ex) {
        ex.printStackTrace();
    }
    return thisDir;

}