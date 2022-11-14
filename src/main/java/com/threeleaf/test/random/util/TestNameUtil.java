/*
 * Copyright 2019-2020, ThreeLeaf.com
 */

package com.threeleaf.test.random.util;

import static com.threeleaf.test.random.TestBoolean.randomBoolean;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;
import static lombok.AccessLevel.PRIVATE;

import java.util.List;

import com.google.common.collect.ImmutableList;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = PRIVATE)
@SuppressWarnings(
    {"WeakerAccess", "SpellCheckingInspection", "squid:S1192" /* Repeated names okay */})
public final class TestNameUtil {

    /** Top 500 female names of 2017 according to the Social Security Administration. */
    public static final List<String> NAMES_FIRST_FEMALE = ImmutableList.of(
        "Emma",
        "Olivia",
        "Ava",
        "Isabella",
        "Sophia",
        "Mia",
        "Charlotte",
        "Amelia",
        "Evelyn",
        "Abigail",
        "Harper",
        "Emily",
        "Elizabeth",
        "Avery",
        "Sofia",
        "Ella",
        "Madison",
        "Scarlett",
        "Victoria",
        "Aria",
        "Grace",
        "Chloe",
        "Camila",
        "Penelope",
        "Riley",
        "Layla",
        "Lillian",
        "Nora",
        "Zoey",
        "Mila",
        "Aubrey",
        "Hannah",
        "Lily",
        "Addison",
        "Eleanor",
        "Natalie",
        "Luna",
        "Savannah",
        "Brooklyn",
        "Leah",
        "Zoe",
        "Stella",
        "Hazel",
        "Ellie",
        "Paisley",
        "Audrey",
        "Skylar",
        "Violet",
        "Claire",
        "Bella",
        "Aurora",
        "Lucy",
        "Anna",
        "Samantha",
        "Caroline",
        "Genesis",
        "Aaliyah",
        "Kennedy",
        "Kinsley",
        "Allison",
        "Maya",
        "Sarah",
        "Madelyn",
        "Adeline",
        "Alexa",
        "Ariana",
        "Elena",
        "Gabriella",
        "Naomi",
        "Alice",
        "Sadie",
        "Hailey",
        "Eva",
        "Emilia",
        "Autumn",
        "Quinn",
        "Nevaeh",
        "Piper",
        "Ruby",
        "Serenity",
        "Willow",
        "Everly",
        "Cora",
        "Kaylee",
        "Lydia",
        "Aubree",
        "Arianna",
        "Eliana",
        "Peyton",
        "Melanie",
        "Gianna",
        "Isabelle",
        "Julia",
        "Valentina",
        "Nova",
        "Clara",
        "Vivian",
        "Reagan",
        "Mackenzie",
        "Madeline",
        "Brielle",
        "Delilah",
        "Isla",
        "Rylee",
        "Katherine",
        "Sophie",
        "Josephine",
        "Ivy",
        "Liliana",
        "Jade",
        "Maria",
        "Taylor",
        "Hadley",
        "Kylie",
        "Emery",
        "Adalynn",
        "Natalia",
        "Annabelle",
        "Faith",
        "Alexandra",
        "Ximena",
        "Ashley",
        "Brianna",
        "Raelynn",
        "Bailey",
        "Mary",
        "Athena",
        "Andrea",
        "Leilani",
        "Jasmine",
        "Lyla",
        "Margaret",
        "Alyssa",
        "Adalyn",
        "Arya",
        "Norah",
        "Khloe",
        "Kayla",
        "Eden",
        "Eliza",
        "Rose",
        "Ariel",
        "Melody",
        "Alexis",
        "Isabel",
        "Sydney",
        "Juliana",
        "Lauren",
        "Iris",
        "Emerson",
        "London",
        "Morgan",
        "Lilly",
        "Charlie",
        "Aliyah",
        "Valeria",
        "Arabella",
        "Sara",
        "Finley",
        "Trinity",
        "Ryleigh",
        "Jordyn",
        "Jocelyn",
        "Kimberly",
        "Esther",
        "Molly",
        "Valerie",
        "Cecilia",
        "Anastasia",
        "Daisy",
        "Reese",
        "Laila",
        "Mya",
        "Amy",
        "Teagan",
        "Amaya",
        "Elise",
        "Harmony",
        "Paige",
        "Adaline",
        "Fiona",
        "Alaina",
        "Nicole",
        "Genevieve",
        "Lucia",
        "Alina",
        "Mckenzie",
        "Callie",
        "Payton",
        "Eloise",
        "Brooke",
        "Londyn",
        "Mariah",
        "Julianna",
        "Rachel",
        "Daniela",
        "Gracie",
        "Catherine",
        "Angelina",
        "Presley",
        "Josie",
        "Harley",
        "Adelyn",
        "Vanessa",
        "Makayla",
        "Parker",
        "Juliette",
        "Amara",
        "Marley",
        "Lila",
        "Ana",
        "Rowan",
        "Alana",
        "Michelle",
        "Malia",
        "Rebecca",
        "Brooklynn",
        "Brynlee",
        "Summer",
        "Sloane",
        "Leila",
        "Sienna",
        "Adriana",
        "Sawyer",
        "Kendall",
        "Juliet",
        "Destiny",
        "Alayna",
        "Elliana",
        "Diana",
        "Hayden",
        "Ayla",
        "Dakota",
        "Angela",
        "Noelle",
        "Rosalie",
        "Joanna",
        "Jayla",
        "Alivia",
        "Lola",
        "Emersyn",
        "Georgia",
        "Selena",
        "June",
        "Daleyza",
        "Tessa",
        "Maggie",
        "Jessica",
        "Remi",
        "Delaney",
        "Camille",
        "Vivienne",
        "Hope",
        "Mckenna",
        "Gemma",
        "Olive",
        "Alexandria",
        "Blakely",
        "Izabella",
        "Catalina",
        "Raegan",
        "Journee",
        "Gabrielle",
        "Lucille",
        "Ruth",
        "Amiyah",
        "Evangeline",
        "Blake",
        "Thea",
        "Amina",
        "Giselle",
        "Lilah",
        "Melissa",
        "River",
        "Kate",
        "Adelaide",
        "Charlee",
        "Vera",
        "Leia",
        "Gabriela",
        "Zara",
        "Jane",
        "Journey",
        "Elaina",
        "Miriam",
        "Briella",
        "Stephanie",
        "Cali",
        "Ember",
        "Lilliana",
        "Aniyah",
        "Logan",
        "Kamila",
        "Brynn",
        "Ariella",
        "Makenzie",
        "Annie",
        "Mariana",
        "Kali",
        "Haven",
        "Elsie",
        "Nyla",
        "Paris",
        "Lena",
        "Freya",
        "Adelynn",
        "Lyric",
        "Camilla",
        "Sage",
        "Jennifer",
        "Paislee",
        "Talia",
        "Alessandra",
        "Juniper",
        "Fatima",
        "Raelyn",
        "Amira",
        "Arielle",
        "Phoebe",
        "Kinley",
        "Ada",
        "Nina",
        "Ariah",
        "Samara",
        "Myla",
        "Brinley",
        "Cassidy",
        "Maci",
        "Aspen",
        "Allie",
        "Keira",
        "Kaia",
        "Makenna",
        "Amanda",
        "Heaven",
        "Joy",
        "Lia",
        "Madilyn",
        "Gracelyn",
        "Laura",
        "Evelynn",
        "Lexi",
        "Haley",
        "Miranda",
        "Kaitlyn",
        "Daniella",
        "Felicity",
        "Jacqueline",
        "Evie",
        "Angel",
        "Danielle",
        "Ainsley",
        "Dylan",
        "Kiara",
        "Millie",
        "Jordan",
        "Maddison",
        "Rylie",
        "Alicia",
        "Maeve",
        "Margot",
        "Kylee",
        "Phoenix",
        "Heidi",
        "Zuri",
        "Alondra",
        "Lana",
        "Madeleine",
        "Gracelynn",
        "Kenzie",
        "Miracle",
        "Shelby",
        "Elle",
        "Adrianna",
        "Bianca",
        "Addilyn",
        "Kira",
        "Veronica",
        "Gwendolyn",
        "Esmeralda",
        "Chelsea",
        "Alison",
        "Skyler",
        "Magnolia",
        "Daphne",
        "Jenna",
        "Everleigh",
        "Kyla",
        "Braelynn",
        "Harlow",
        "Annalise",
        "Mikayla",
        "Dahlia",
        "Maliyah",
        "Averie",
        "Scarlet",
        "Kayleigh",
        "Luciana",
        "Kelsey",
        "Nadia",
        "Amber",
        "Gia",
        "Kamryn",
        "Yaretzi",
        "Carmen",
        "Jimena",
        "Erin",
        "Christina",
        "Katie",
        "Ryan",
        "Viviana",
        "Alexia",
        "Anaya",
        "Serena",
        "Katelyn",
        "Ophelia",
        "Regina",
        "Helen",
        "Remington",
        "Camryn",
        "Cadence",
        "Royalty",
        "Amari",
        "Kathryn",
        "Skye",
        "Emely",
        "Jada",
        "Ariyah",
        "Aylin",
        "Saylor",
        "Kendra",
        "Cheyenne",
        "Fernanda",
        "Sabrina",
        "Francesca",
        "Eve",
        "Mckinley",
        "Frances",
        "Sarai",
        "Carolina",
        "Kennedi",
        "Nylah",
        "Tatum",
        "Alani",
        "Lennon",
        "Raven",
        "Zariah",
        "Leslie",
        "Winter",
        "Abby",
        "Mabel",
        "Sierra",
        "April",
        "Willa",
        "Carly",
        "Jolene",
        "Rosemary",
        "Aviana",
        "Madelynn",
        "Selah",
        "Renata",
        "Lorelei",
        "Briana",
        "Celeste",
        "Wren",
        "Charleigh",
        "Leighton",
        "Annabella",
        "Jayleen",
        "Braelyn",
        "Ashlyn",
        "Jazlyn",
        "Mira",
        "Oakley",
        "Malaysia",
        "Edith",
        "Avianna",
        "Maryam",
        "Emmalyn",
        "Hattie",
        "Kensley",
        "Macie",
        "Bristol",
        "Marlee",
        "Demi",
        "Cataleya",
        "Maia",
        "Sylvia",
        "Itzel",
        "Allyson",
        "Lilith",
        "Melany",
        "Kaydence",
        "Holly",
        "Nayeli",
        "Meredith",
        "Nia",
        "Liana",
        "Megan",
        "Justice",
        "Bethany",
        "Alejandra",
        "Janelle",
        "Elisa",
        "Adelina",
        "Ashlynn",
        "Elianna",
        "Aleah",
        "Myra",
        "Lainey",
        "Blair",
        "Kassidy",
        "Charley",
        "Virginia",
        "Kara",
        "Helena",
        "Sasha",
        "Julie",
        "Michaela",
        "Carter",
        "Matilda",
        "Kehlani",
        "Henley",
        "Maisie",
        "Hallie",
        "Jazmin",
        "Priscilla",
        "Marilyn",
        "Cecelia",
        "Danna",
        "Colette",
        "Baylee",
        "Elliott",
        "Ivanna",
        "Cameron",
        "Celine",
        "Alayah",
        "Hanna",
        "Imani",
        "Angelica",
        "Emelia",
        "Kalani",
        "Alanna",
        "Lorelai",
        "Macy",
        "Karina",
        "Addyson",
        "Aleena",
        "Aisha",
        "Johanna",
        "Mallory",
        "Leona",
        "Mariam",
        "Kynlee",
        "Madilynn",
        "Karen",
        "Karla",
        "Skyla",
        "Beatrice",
        "Dayana",
        "Gloria",
        "Milani",
        "Savanna",
        "Karsyn",
        "Rory",
        "Giuliana",
        "Lauryn",
        "Liberty",
        "Galilea",
        "Aubrie",
        "Charli",
        "Kyleigh",
        "Brylee",
        "Jillian",
        "Anne",
        "Haylee",
        "Dallas",
        "Azalea",
        "Jayda",
        "Tiffany",
        "Avah",
        "Shiloh",
        "Bailee",
        "Jazmine",
        "Esme",
        "Coraline",
        "Madisyn",
        "Elaine",
        "Lilian",
        "Kyra"
    );

    /** Top 500 male names of 2017 according to the Social Security Administration. */
    public static final List<String> NAMES_FIRST_MALE = ImmutableList.of(
        "Liam",
        "Noah",
        "William",
        "James",
        "Logan",
        "Benjamin",
        "Mason",
        "Elijah",
        "Oliver",
        "Jacob",
        "Lucas",
        "Michael",
        "Alexander",
        "Ethan",
        "Daniel",
        "Matthew",
        "Aiden",
        "Henry",
        "Joseph",
        "Jackson",
        "Samuel",
        "Sebastian",
        "David",
        "Carter",
        "Wyatt",
        "Jayden",
        "John",
        "Owen",
        "Dylan",
        "Luke",
        "Gabriel",
        "Anthony",
        "Isaac",
        "Grayson",
        "Jack",
        "Julian",
        "Levi",
        "Christopher",
        "Joshua",
        "Andrew",
        "Lincoln",
        "Mateo",
        "Ryan",
        "Jaxon",
        "Nathan",
        "Aaron",
        "Isaiah",
        "Thomas",
        "Charles",
        "Caleb",
        "Josiah",
        "Christian",
        "Hunter",
        "Eli",
        "Jonathan",
        "Connor",
        "Landon",
        "Adrian",
        "Asher",
        "Cameron",
        "Leo",
        "Theodore",
        "Jeremiah",
        "Hudson",
        "Robert",
        "Easton",
        "Nolan",
        "Nicholas",
        "Ezra",
        "Colton",
        "Angel",
        "Brayden",
        "Jordan",
        "Dominic",
        "Austin",
        "Ian",
        "Adam",
        "Elias",
        "Jaxson",
        "Greyson",
        "Jose",
        "Ezekiel",
        "Carson",
        "Evan",
        "Maverick",
        "Bryson",
        "Jace",
        "Cooper",
        "Xavier",
        "Parker",
        "Roman",
        "Jason",
        "Santiago",
        "Chase",
        "Sawyer",
        "Gavin",
        "Leonardo",
        "Kayden",
        "Ayden",
        "Jameson",
        "Kevin",
        "Bentley",
        "Zachary",
        "Everett",
        "Axel",
        "Tyler",
        "Micah",
        "Vincent",
        "Weston",
        "Miles",
        "Wesley",
        "Nathaniel",
        "Harrison",
        "Brandon",
        "Cole",
        "Declan",
        "Luis",
        "Braxton",
        "Damian",
        "Silas",
        "Tristan",
        "Ryder",
        "Bennett",
        "George",
        "Emmett",
        "Justin",
        "Kai",
        "Max",
        "Diego",
        "Luca",
        "Ryker",
        "Carlos",
        "Maxwell",
        "Kingston",
        "Ivan",
        "Maddox",
        "Juan",
        "Ashton",
        "Jayce",
        "Rowan",
        "Kaiden",
        "Giovanni",
        "Eric",
        "Jesus",
        "Calvin",
        "Abel",
        "King",
        "Camden",
        "Amir",
        "Blake",
        "Alex",
        "Brody",
        "Malachi",
        "Emmanuel",
        "Jonah",
        "Beau",
        "Jude",
        "Antonio",
        "Alan",
        "Elliott",
        "Elliot",
        "Waylon",
        "Xander",
        "Timothy",
        "Victor",
        "Bryce",
        "Finn",
        "Brantley",
        "Edward",
        "Abraham",
        "Patrick",
        "Grant",
        "Karter",
        "Hayden",
        "Richard",
        "Miguel",
        "Joel",
        "Gael",
        "Tucker",
        "Rhett",
        "Avery",
        "Steven",
        "Graham",
        "Kaleb",
        "Jasper",
        "Jesse",
        "Matteo",
        "Dean",
        "Zayden",
        "Preston",
        "August",
        "Oscar",
        "Jeremy",
        "Alejandro",
        "Marcus",
        "Dawson",
        "Lorenzo",
        "Messiah",
        "Zion",
        "Maximus",
        "River",
        "Zane",
        "Mark",
        "Brooks",
        "Nicolas",
        "Paxton",
        "Judah",
        "Emiliano",
        "Kaden",
        "Bryan",
        "Kyle",
        "Myles",
        "Peter",
        "Charlie",
        "Kyrie",
        "Thiago",
        "Brian",
        "Kenneth",
        "Andres",
        "Lukas",
        "Aidan",
        "Jax",
        "Caden",
        "Milo",
        "Paul",
        "Beckett",
        "Brady",
        "Colin",
        "Omar",
        "Bradley",
        "Javier",
        "Knox",
        "Jaden",
        "Barrett",
        "Israel",
        "Matias",
        "Jorge",
        "Zander",
        "Derek",
        "Josue",
        "Cayden",
        "Holden",
        "Griffin",
        "Arthur",
        "Leon",
        "Felix",
        "Remington",
        "Jake",
        "Killian",
        "Clayton",
        "Sean",
        "Adriel",
        "Riley",
        "Archer",
        "Legend",
        "Erick",
        "Enzo",
        "Corbin",
        "Francisco",
        "Dallas",
        "Emilio",
        "Gunner",
        "Simon",
        "Andre",
        "Walter",
        "Damien",
        "Chance",
        "Phoenix",
        "Colt",
        "Tanner",
        "Stephen",
        "Kameron",
        "Tobias",
        "Manuel",
        "Amari",
        "Emerson",
        "Louis",
        "Cody",
        "Finley",
        "Iker",
        "Martin",
        "Rafael",
        "Nash",
        "Beckham",
        "Cash",
        "Karson",
        "Rylan",
        "Reid",
        "Theo",
        "Ace",
        "Eduardo",
        "Spencer",
        "Raymond",
        "Maximiliano",
        "Anderson",
        "Ronan",
        "Lane",
        "Cristian",
        "Titus",
        "Travis",
        "Jett",
        "Ricardo",
        "Bodhi",
        "Gideon",
        "Jaiden",
        "Fernando",
        "Mario",
        "Conor",
        "Keegan",
        "Ali",
        "Cesar",
        "Ellis",
        "Jayceon",
        "Walker",
        "Cohen",
        "Arlo",
        "Hector",
        "Dante",
        "Kyler",
        "Garrett",
        "Donovan",
        "Seth",
        "Jeffrey",
        "Tyson",
        "Jase",
        "Desmond",
        "Caiden",
        "Gage",
        "Atlas",
        "Major",
        "Devin",
        "Edwin",
        "Angelo",
        "Orion",
        "Conner",
        "Julius",
        "Marco",
        "Jensen",
        "Daxton",
        "Peyton",
        "Zayn",
        "Collin",
        "Jaylen",
        "Dakota",
        "Prince",
        "Johnny",
        "Kayson",
        "Cruz",
        "Hendrix",
        "Atticus",
        "Troy",
        "Kane",
        "Edgar",
        "Sergio",
        "Kash",
        "Marshall",
        "Johnathan",
        "Romeo",
        "Shane",
        "Warren",
        "Joaquin",
        "Wade",
        "Leonel",
        "Trevor",
        "Dominick",
        "Muhammad",
        "Erik",
        "Odin",
        "Quinn",
        "Jaxton",
        "Dalton",
        "Nehemiah",
        "Frank",
        "Grady",
        "Gregory",
        "Andy",
        "Solomon",
        "Malik",
        "Rory",
        "Clark",
        "Reed",
        "Harvey",
        "Zayne",
        "Jay",
        "Jared",
        "Noel",
        "Shawn",
        "Fabian",
        "Ibrahim",
        "Adonis",
        "Ismael",
        "Pedro",
        "Leland",
        "Malakai",
        "Malcolm",
        "Alexis",
        "Kason",
        "Porter",
        "Sullivan",
        "Raiden",
        "Allen",
        "Ari",
        "Russell",
        "Princeton",
        "Winston",
        "Kendrick",
        "Roberto",
        "Lennox",
        "Hayes",
        "Finnegan",
        "Nasir",
        "Kade",
        "Nico",
        "Emanuel",
        "Landen",
        "Moises",
        "Ruben",
        "Hugo",
        "Abram",
        "Adan",
        "Khalil",
        "Zaiden",
        "Augustus",
        "Marcos",
        "Philip",
        "Phillip",
        "Cyrus",
        "Esteban",
        "Braylen",
        "Albert",
        "Bruce",
        "Kamden",
        "Lawson",
        "Jamison",
        "Sterling",
        "Damon",
        "Gunnar",
        "Kyson",
        "Luka",
        "Franklin",
        "Ezequiel",
        "Pablo",
        "Derrick",
        "Zachariah",
        "Cade",
        "Jonas",
        "Dexter",
        "Kolton",
        "Remy",
        "Hank",
        "Tate",
        "Trenton",
        "Kian",
        "Drew",
        "Mohamed",
        "Dax",
        "Rocco",
        "Bowen",
        "Mathias",
        "Ronald",
        "Francis",
        "Matthias",
        "Milan",
        "Maximilian",
        "Royce",
        "Skyler",
        "Corey",
        "Kasen",
        "Drake",
        "Gerardo",
        "Jayson",
        "Sage",
        "Braylon",
        "Benson",
        "Moses",
        "Alijah",
        "Rhys",
        "Otto",
        "Oakley",
        "Armando",
        "Jaime",
        "Nixon",
        "Saul",
        "Scott",
        "Brycen",
        "Ariel",
        "Enrique",
        "Donald",
        "Chandler",
        "Asa",
        "Eden",
        "Davis",
        "Keith",
        "Frederick",
        "Rowen",
        "Lawrence",
        "Leonidas",
        "Aden",
        "Julio",
        "Darius"
    );

    /** Top 100 last names, according to Wikipedia. */
    public static final List<String> NAMES_LAST = ImmutableList.of(
        "Smith",
        "Johnson",
        "Williams",
        "Brown",
        "Jones",
        "Miller",
        "Davis",
        "Garcia",
        "Rodriguez",
        "Wilson",
        "Martinez",
        "Anderson",
        "Taylor",
        "Thomas",
        "Hernandez",
        "Moore",
        "Martin",
        "Jackson",
        "Thompson",
        "White",
        "Lopez",
        "Lee",
        "Gonzalez",
        "Harris",
        "Clark",
        "Lewis",
        "Robinson",
        "Walker",
        "Perez",
        "Hall",
        "Young",
        "Allen",
        "Sanchez",
        "Wright",
        "King",
        "Scott",
        "Green",
        "Baker",
        "Adams",
        "Nelson",
        "Hill",
        "Ramirez",
        "Campbell",
        "Mitchell",
        "Roberts",
        "Carter",
        "Phillips",
        "Evans",
        "Turner",
        "Torres",
        "Parker",
        "Collins",
        "Edwards",
        "Stewart",
        "Flores",
        "Morris",
        "Nguyen",
        "Murphy",
        "Rivera",
        "Cook",
        "Rogers",
        "Morgan",
        "Peterson",
        "Cooper",
        "Reed",
        "Bailey",
        "Bell",
        "Gomez",
        "Kelly",
        "Howard",
        "Ward",
        "Cox",
        "Diaz",
        "Richardson",
        "Wood",
        "Watson",
        "Brooks",
        "Bennett",
        "Gray",
        "James",
        "Reyes",
        "Cruz",
        "Hughes",
        "Price",
        "Myers",
        "Long",
        "Foster",
        "Sanders",
        "Ross",
        "Morales",
        "Powell",
        "Sullivan",
        "Russell",
        "Ortiz",
        "Jenkins",
        "Gutierrez",
        "Perry",
        "Butler",
        "Barnes",
        "Fisher"
    );

    /**
     * Return a first and last name.
     *
     * @return a  name
     */
    public static String randomName() {
        return randomNameFirst() + ' ' + randomNameLast();
    }

    /**
     * Return a top name.
     *
     * @return a name
     */
    public static String randomNameFirst() {
        return randomBoolean() ? randomNameFirstFemale() : randomNameFirstMale();
    }

    /**
     * Return a top female name.
     *
     * @return a female name
     */
    public static String randomNameFirstFemale() {
        return chooseOneFrom(NAMES_FIRST_FEMALE);
    }

    /**
     * Return a top male name.
     *
     * @return a male name
     */
    public static String randomNameFirstMale() {
        return chooseOneFrom(NAMES_FIRST_MALE);
    }

    /**
     * Return a top last name.
     *
     * @return a male name
     */
    public static String randomNameLast() {
        return chooseOneFrom(NAMES_LAST);
    }
}
