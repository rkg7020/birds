
Birdlife International regularly publishes the Red List of endangered birds.

In the resources folder there is a csv file called "birds.csv".
It contains a single line for each bird species in the world.

Each line has 4 fields separated by ";" (semicolon).

The structure is:
Bird Family;English Bird Name;Scientific Bird Name;IUCN Category

The IUCN Category defines if a species is endangered and how endangered it is.
These are the possible values (sorted from least to most endangered).
LC (Least Concern)
NT (NearThreatened)
VU (Vulnerable)
EN (Endangered)
CR (Critically Endangered)
EW (Extinct in the Wild)
EX (Extinct)
DD (Data Deficient)

Note: Only the short two-character form is used in the file, the value is parentheses is just for explanation

Your task:
Find all hawks (eagles, buzzards, vultures, kites, etc), sort them according to their IUCN Category and print them (System.out.println).
For each species you should print at least the English name, the scientific name and the IUCN category.


Sorting should be according to the list above with birds in the "LC" category printed first and birds in the "DD" category printed last.

You can find all hawks using the family name "Hawks, eagles"
add comments
add 567

