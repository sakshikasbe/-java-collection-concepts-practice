import java.util.HashMap;
import java.util.Map;
class TestMap {
    String name;
    public TestMap(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
//        if (this == obj){
//            return true;
//        } else if (obj instanceof TestMap){
//            return this.name.equals(((TestMap) obj).name);
//        } else {
//            return false;
//        }
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

class KnowledgeCheckHashMap {
    public static void main(String[] args) {
        Map<TestMap, String> hashMap = new HashMap<>();
        TestMap test1 = new TestMap("a");//test1=1000h
        TestMap test2 = new TestMap("b");//test2=2000h
        System.out.println(hashMap);
        hashMap.put(test1, "a");
        System.out.println(hashMap);

        hashMap.put(test2, "b");
        System.out.println(hashMap);

        TestMap test3 = new TestMap("a");//test3=3000h

        TestMap test4 = new TestMap("b");////test4=4000h

        System.out.println(hashMap.get(test3));
        System.out.println(hashMap);

        System.out.println(hashMap.get(test4));
        System.out.println(hashMap);
    }
}
/*
-:HashMap working mechanism:-
HashMap works in 2 passes:-
1 -> Use HashCode and then find index of bucket using hash function
2 -> Use equals method when two keys have same hashCode// Key content is compared when same hashcode.
There are 3 Scenarios->
1. Two keys have same hashCode 	    --> Use equals method
				    		        --> equals returns true --> overwrite/update
2. Two keys have same hashCode 	    --> Use equals method
				    		        --> equals returns false --> Create new node in same bucket.
3. Two keys have different hashCode --> Create new Node to store key,value
Visualize it as below:-
0[]
1[] -->[1, 1000h, "a", 1234h] --> [1, 2000h,"b", null]
2[]
3[]
4[]
5[]
6[]
7[]
In case of equals method is not overridden and doesn't return true all the time.
1. hashMap.get(test3) --> no key present in the map -->returns null
2. same for hashMap.get(test4) --> no key present in the map -->returns null
---------------------+++++++++++++++++++++++++------------------------
In case of equals method is overridden and returns true all the time.
1. hashMap.get(test3) --> no key present in the map -->returns null
2. same for hashMap.get(test4) --> no key present in the map -->returns null
put test1/1000h -->
Visualize it as below:-
0[]
1[] -->[1, 1000h, "a", null]
2[]
3[]
4[]
5[]
6[]
7[]
put test2/2000h -->
Visualize it as below:-
0[]
1[] -->[1, 1000h, "b", null]
2[]
3[]
4[]
5[]
6[]
7[]
now for hashMap.get(test3/3000h) --> hashCode(that is 1) is already present in the bucket and equals returns true.
Hence, it will return "b"
Visualize it as below:-
0[]
1[] -->[1, 1000h, "b", null]
2[]
3[]
4[]
5[]
6[]
7[]
now for hashMap.get(test4/4000h) --> hashCode(that is 1) is already present in the bucket and equals returns true.
Hence, it will return "b"
Visualize it as below:-
0[]
1[] -->[1, 1000h, "b", null]
2[]
3[]
4[]
5[]
6[]
7[]
 */