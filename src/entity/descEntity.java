
package entity;


public class descEntity 
{
    
    private String Field;
    private String Type;
    private String Null;
    private String Key;
    private String Default;
    private String Extra;
    
    /* constructor */
    public descEntity() 
    {
        this("", "", "", "-", "", "-");
    }

    public descEntity(String Field, String Type, String Null, String Key, String Default, String Extra) 
    {
        this.Field = Field;
        this.Type = Type;
        this.Null = Null;
        this.Key = Key;
        this.Default = Default;
        this.Extra = Extra;
    }
    
    public descEntity(descEntity dE)
    {
        this.Field = dE.Field;
        this.Type = dE.Type;
        this.Null = dE.Null;
        this.Key = dE.Key;
        this.Default = dE.Default;
        this.Extra = dE.Extra;
    }

    public String getField() {
        return Field;
    }

    public void setField(String Field) {
        this.Field = Field;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getNull() {
        return Null;
    }

    public void setNull(String Null) {
        this.Null = Null;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String Key) {
        this.Key = Key;
    }

    public String getDefault() {
        return Default;
    }

    public void setDefault(String Default) {
        this.Default = Default;
    }

    public String getExtra() {
        return Extra;
    }

    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    @Override
    public String toString() {
        return "descEntity: " + "Field= " + Field + "\n" +
                " Type: " + Type + "\n" +
                " Null: " + Null + "\n" +
                " Key: " + Key + "\n" +
                " Default: " + Default + "\n" +
                " Extra: " + Extra + "\n" ;
    }
    
    
    
}
