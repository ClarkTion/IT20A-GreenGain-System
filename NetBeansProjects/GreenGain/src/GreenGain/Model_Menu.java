
package GreenGain;

//import javax.swing.Icon;


public class Model_Menu {

    private String name;
//    public String geticon(){
//        return icon;
//    }
//    public void setIcon(String icon){
//        this.icon = icon;
//    }
    public String getName() {
    return this.name; 
}
    

    public void getName(String name){
        this.name = name;
    }
    public MenuType getType(){
        return type;
    }
     public void setType(MenuType type){
        this.type = type;
    }
     public Model_Menu(String icon, String name, MenuType type){
//         this.icon = icon;
         this.name = name;
         this.type = type;
     }
     public Model_Menu(){
         
     }
    
//   private String icon;
//    private String name;
    private MenuType type;

//    Icon toIcon() {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }

   
    
//    public Icon toIcon(){
//        return new ImageIcon(getClass().getResource(name));
//    }
    public static enum MenuType{
        TITLE, MENU, EMPTY
    }
}
