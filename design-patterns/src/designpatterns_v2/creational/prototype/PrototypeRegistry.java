package designpatterns_v2.creational.prototype;

public class PrototypeRegistry {
    public static void main(String[] args) {
        Prototype[] prototypes = new Prototype[4];

        Prototype a = new PrototypeA("A",10);
        prototypes[0] = a;

        Prototype aClone = a.clone();
        prototypes[1] = aClone;

        Prototype b = new PrototypeB("B",12,15);
        prototypes[2] = b;

        Prototype bClone = b.clone();
        prototypes[3] = bClone;

        copyProtoTypes(prototypes);

    }

    public static Prototype[] copyProtoTypes(Prototype[] prototypes){
        Prototype[] copies = new Prototype[4];
        for(int i = 0;i<prototypes.length;i++){
            copies[i] = prototypes[i].clone();

            System.out.println(prototypes[i].name+" "+ copies[i].name );
        }
        return copies;
    }

}
