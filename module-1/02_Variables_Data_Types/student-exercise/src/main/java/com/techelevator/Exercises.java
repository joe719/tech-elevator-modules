package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInWoods = 3;
		int raccoonsLeaving4Dinner = 2;
		int raccoonsStillInWoods = raccoonsInWoods - raccoonsLeaving4Dinner; 

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int beesVsFlowers = flowers - bees;   
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int loneEatingPigeon = 1;
		int lonePigeon = 1;
		int eatingPigeons = loneEatingPigeon + lonePigeon;
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsPerched = 3;
		int owlsLanding = 2;
		int owlsOnFence = owlsPerched + owlsLanding;
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversShirking = 1;
		int beaversActuallyWorking = beaversWorking - beaversShirking;
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		
		int toucansPerched = 2;
		int toucansNotPerched = 1;
		int toucansOnLimb = toucansPerched + toucansNotPerched;
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int squirrels = 4;
		int nuts = 2;
		int differenceOfNutsToSquirrels = squirrels - nuts;

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		int quarter = 25;
		int dime = 10;
		int nickle = 5;
		int mrsHiltsPocketInCents = quarter + dime + nickle + nickle;
	
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		
		int briersMuffins = 18;
		int macadamsMuffins = 20;
		int flannerysMuffins = 17;
		int firstGradesMuffins = briersMuffins + macadamsMuffins + flannerysMuffins;
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		double yoyoPriceIn$ = .24;
		double whistlePriceIn$ = .14;
		double hiltsSpendingIn$ = yoyoPriceIn$ - whistlePriceIn$; 
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		
		int largeMarshmallos = 8;
		int miniMarshmallos = 10;
		int totalMarshmallos = largeMarshmallos + miniMarshmallos;
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		
		int inchesOfSnowHiltsHouse = 29;
		int inchesOfSnowBrecknockElementary = 17;
		int inchesOfSnowDifference = inchesOfSnowHiltsHouse - inchesOfSnowBrecknockElementary;
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltBegining$ = 10;
		int toyTruckPriceIn$ = 3;
		int pencilPriceIn$ = 2;
		int hiltchange = hiltBegining$ - toyTruckPriceIn$ - pencilPriceIn$;
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshsBeginingMarbles = 16;
		int joshsLostMarbles = 7;
		int joshsCurrentMarbles = joshsBeginingMarbles - joshsLostMarbles;
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int megansCurrentSeashells = 19;
		int megansFutureSeashells = 25;
		int megansNeededSeashells = megansFutureSeashells - megansCurrentSeashells;

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int bradsTotalBalloons = 17;
		int bradsRedBalloons = 8;
		int bradsGreenBalloons = bradsTotalBalloons - bradsRedBalloons;
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int booksOriginallyOnShelf = 38;
		int booksAddedToShelf = 10;
		int currentBooksOnShelf = booksOriginallyOnShelf + booksAddedToShelf;
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int legsBeesHave = 6;
		int beesWereCounting = 8;
		int beesLegsWereCounting = legsBeesHave * beesWereCounting;
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		double iceCreamConePriceInDollars = .99;
		double priceTwoIceCreamConesInDollars = iceCreamConePriceInDollars * 2;
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksNeededForBorder = 125;
		int rocksHiltHas = 64;
		int rocksStillNeeded = rocksNeededForBorder - rocksHiltHas;
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int hiltsMarbles = 38;
		int hiltsLostMarbles = 15;
		int hiltsCurrentMarbles = hiltsMarbles - hiltsLostMarbles;
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int hiltConcertDistanceTotalMiles = 78;
		int distanceDrivenMiles = 32;
		int distanceRemainingMiles = hiltConcertDistanceTotalMiles - distanceDrivenMiles;
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int hiltMorningSnowShovelingMinutes = 90;
		int hiltAfternoonSnowShovelingMinutes = 45;
		int hiltTotalSnowShovelingMinutes = hiltAfternoonSnowShovelingMinutes + hiltMorningSnowShovelingMinutes;
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotDogPriceInDollars = .50;
		double hiltQuantityHotDogsBought = 6;
		double hiltTotalHotDogMoneySpent = hotDogPriceInDollars * hiltQuantityHotDogsBought;

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		
		double hiltsMoneyInDollars = .50;
		double pencilPriceInDollars = .07;
		double hiltsPencils = hiltsMoneyInDollars / pencilPriceInDollars;
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int totalButterfliesHiltSaw = 33;
		int orangeButterfliesHiltSaw = 20;
		int redButterfliersHiltSaw = totalButterfliesHiltSaw - orangeButterfliesHiltSaw;
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		
		double katesMoneyIn$ = 1;
		double katesSpendingIn$ = .54;
		double katesChange = katesMoneyIn$ - katesSpendingIn$;
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		
		int marksBeginingTrees = 13;
		int treesMarksPlanting = 12;
		
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInADay = 24;
		int daysUntilJoySeesGrandma = 2;
		int hoursUntilJoySeesGrandma = hoursInADay * daysUntilJoySeesGrandma;
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int quantityKimsCousins = 4;
		int gumPerCousin = 5;
		int totalGumNeeded = quantityKimsCousins * gumPerCousin;
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		int dollarsDanBeginsWith = 3;
		int dollarsDanSpent = 1;
		int currentNumberOfDollarsDanHas = dollarsDanBeginsWith - dollarsDanSpent;
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsOnTheLake = 5;
		int peopleAboardABoat = 3;
		int totalPeopleOnTheLake = boatsOnTheLake * peopleAboardABoat;
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int ellensBeginingQuantityLegos = 380;
		int ellensLostLegos = 57;
		int ellensCurrentQuantityLegos = ellensBeginingQuantityLegos - ellensLostLegos;
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int muffinsArthurBaked = 35;
		int arthursTargetMuffinQuantity = 83;
		int muffinsNeeded = arthursTargetMuffinQuantity - muffinsArthurBaked;
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int quantityWillysCrayons = 1400;
		int quantityLucysCrayons = 290;
		int quantityMoreCrayonsWillyHasThanLucy = quantityWillysCrayons - quantityLucysCrayons;
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersPerPage * pagesOfStickers;
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int totalCupcakes = 96;
		int totalChildren = 8;
		int cupcakesPerChild = totalCupcakes / totalChildren;
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int totalGingerbreadCookies = 47;
		int jarCapacityInCookies = 6;
		int cookiesLeftoverAfterJaring = totalGingerbreadCookies % jarCapacityInCookies;
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int totalCroissants = 59;
		int croissantsDistributedPerNeighbor = 8;
		int croissantsLeftOver = totalCroissants % croissantsDistributedPerNeighbor; 
		
		
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		
		int trayCapacityInCookies = 12;
		int totalCookiesToBeBaked = 276;
		int traysNeeded = totalCookiesToBeBaked / trayCapacityInCookies;
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		
		int pretzelsMarianPrepared = 480;
		int pretzelServingSize = 12;
		int totalServings = pretzelsMarianPrepared / pretzelServingSize;
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		
		int lemonCupcakesMade = 53;
		int lemonCupcakesLeftAtHome = 2;
		int boxCapacityInCupcakes = 3;
		int lemonCupcakesOnHand = lemonCupcakesMade - lemonCupcakesLeftAtHome;
		int boxesNeeded = lemonCupcakesOnHand / boxCapacityInCupcakes;
		
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		
		int preparedCarrotSticks = 74;
		int people = 12;
		int leftOverCarrotSticks = preparedCarrotSticks % people;
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int susiesTeddyBears = 98;
		int shelfCapacityInBears = 7;
		int quanityShelvesfilled = susiesTeddyBears / shelfCapacityInBears;
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int albumCapacityInPictures = 20;
		int pictures = 480;
		int quantityAlbumsNeeded = pictures / albumCapacityInPictures;
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		
		int joesCards = 94;
		int joesBoxesCapacityInCards = 8;
		int joesBoxes = joesCards / joesBoxesCapacityInCards;
		int joesRemainingCards = joesCards % joesBoxesCapacityInCards;
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int susiesFathersBooks = 210;
		int susiesFathersShelves = 10;
		int susiesFathersBooksOnShelves = susiesFathersBooks / susiesFathersShelves;
		

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
				
		double croissantsTotal = 17;
		double guests = 7;
		double croissantsForGuests = croissantsTotal / guests;
		
		
	
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		
		double roomSqft = 12 * 14;
		double billRateSqftPerHr = roomSqft / 2.15;
		double jillRateSqftPerHr = roomSqft / 1.9;
		double billJillCombinedSqftPerHr = billRateSqftPerHr + jillRateSqftPerHr;
		double job1Hrs = (5 * roomSqft) / billJillCombinedSqftPerHr;
		double job2Hrs = (623 * roomSqft) / billJillCombinedSqftPerHr;
		double job2Days = job2Hrs / 8;
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
				;
		String firstName = "Joseph";
		String lastName = "Weinzierl";
		String middleInitial = "M";
		String roleCall = lastName + ", " + middleInitial + ". " + firstName;
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		int distanceToChi = 800;
		int distanceTraveled = 537;
		float percentDistanceTraveledDecimal = distanceTraveled / distanceToChi;
		percentDistanceTraveledDecimal = (float)distanceTraveled / distanceToChi;
		percentDistanceTraveledDecimal = percentDistanceTraveledDecimal * 100;
		int percentDistanceTraveled = (int)percentDistanceTraveledDecimal;
		
		
		
	}

}
