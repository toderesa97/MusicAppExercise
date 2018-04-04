You are given two classes, Cancion (Song) and Library which contains a collection of songs.

#### API of Cancion class:

Inherits Object class and implements Comparable<Cancion> interface.

Attributes:
- Title: String (final)
- Author: String (final)
- Duration: int (final, measured in seconds)

Methods:
- Constructor initialising all attributes.
- Getters
- ``String toString()``: with format, [title: title , author: author , duration: duration ]
- ``boolean equals(Object obj)``: Two objects Cancion (Song) are equal when title, author and duration are equal.
- ``int compareTo(Cancion cancion)``, Compares two Cancion objects in order to sort them based upon title (alphabetically ascent). If two songs have the same title, then sort based upon author (alphabetically ascent).


#### API of Library class:

This class manages a set of Cancion (Songs). Inherits Object.

Attributes:
- songs: List<Cancion>
- libraryName: String
- plays: Map<Cancion, Integer>, song and number of times it has been played within current library.

Methods:
- ``Library(String libraryName)``, creates a particular implementation of interface List and sets a name.
- Getters.
- Setter of libraryName attribute.
- ``boolean add(Cancion c)``,  adds a song. Two songs cannot be within the same library.
- ``boolean remove(Cancion c)`` removes a song if present.
- ``void play(Cancion c)``  plays a song, ie, increment the counter within the map ``plays`` defined as attribute.
- ``List<String> sortSongs()``: which retrieves the string representation of the songs sorted. Create such method by yourself, NOT using any method contained within the Java API.
- ``Cancion searchByTitle(String title)``: which retrieves the song whose title is *approximate* to the title passed as argument. Case insensitive. For such purpose use the method `` boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)`` ¡BUT create such method by yourself within an utilitary class!, ie:

```
public class Util {
	
	public static boolean myRegionMatches(String t, boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		// ...
	}

}
```

- ``Cancion searchByAuthorName(String name)``: Same as the above method.

#### Tests

Create a new package called ``test`` and create classes for testing your code by using the JUnit. Use descriptive names for the methods.


Enjoy and do not hesitate to reach me at toderesa97@gmail.com or using our moodle if any doubt appeared.
