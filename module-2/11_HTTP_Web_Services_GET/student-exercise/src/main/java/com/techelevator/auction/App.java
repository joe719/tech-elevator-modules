package com.techelevator.auction;

import java.util.Scanner;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class App {

    private static final String API_URL = "http://localhost:3000/auctions";
    public static RestTemplate restTemplate = new RestTemplate();
    private static Scanner scanner;

    public static void main(String[] args) {
        init();
        run();
    }

    /**
     * Here to support testing
     */
    public static void init() {
        scanner = new Scanner(System.in);
    }

    public static Auction[] listAllAuctions() {
        RestTemplate restTemplate = new RestTemplate();
        Auction[] deserializedAuctionObject = restTemplate.getForObject("http://localhost:3000/auctions", Auction[].class);
        return deserializedAuctionObject;
    }

    public static Auction listDetailsForAuction() {
    	
    	String userNumber = "";
    	int parsedUserNumber = 0;
    	try {
		Scanner auctionNumber = new Scanner(System.in);
    	System.out.print("Please enter the auction number: ");

    	userNumber = auctionNumber.nextLine();
	} catch(NumberFormatException e) {
		System.out.println("NO Dice");
	}
    	parsedUserNumber = Integer.parseInt(userNumber);
    	
    	RestTemplate restTemplateTwo = new RestTemplate();
        Auction deserializedAuctionObjectTwo = restTemplateTwo.getForObject("http://localhost:3000/auctions/" + parsedUserNumber, Auction.class);
        return deserializedAuctionObjectTwo;
    }

    public static Auction[] findAuctionsSearchTitle() {
    	String userTitle = ""; 
    	try {
		Scanner auctionTitle = new Scanner(System.in);
    	System.out.print("Please enter the auction title: ");
    	userTitle = auctionTitle.nextLine();
    	} catch(Exception e) {
    		System.out.println("NO Dice");
    	}

    	RestTemplate restTemplateThree = new RestTemplate();
        Auction[] deserializedAuctionObjectThree = restTemplateThree.getForObject("http://localhost:3000/auctions?title_like=" + userTitle, Auction[].class);
 
        return deserializedAuctionObjectThree;

    }

    public static Auction[] findAuctionsSearchPrice() {
    	String userPrice = "";
    	double parsedUserPrice = 0;
    	try {
    	Scanner auctionPrice = new Scanner(System.in);
    	System.out.print("Please enter your max bid amount: ");

    	userPrice = auctionPrice.nextLine();
    	parsedUserPrice = Double.parseDouble(userPrice);
    	
	} catch(NumberFormatException e) {
		System.out.println("NO Dice");
	}
    	Auction[] deserializedAuctionObject = restTemplate.getForObject("http://localhost:3000/auctions?currentBid_lte=" + parsedUserPrice, Auction[].class);
        return deserializedAuctionObject;
    	
    }

    private static void run() {
        int menuSelection = 999;

        printGreeting();

        while (menuSelection != 5) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println("");
            if (menuSelection == 1) {
                printAuctions(listAllAuctions());
            } else if (menuSelection == 2) {
                printAuction(listDetailsForAuction());
            } else if (menuSelection == 3) {
                printAuctions(findAuctionsSearchTitle());
            } else if (menuSelection == 4) {
                printAuctions(findAuctionsSearchPrice());
            } else if (menuSelection == 5) {
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            printGreeting();
        }
    }

    private static void printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Online Auctions! Please make a selection: ");
        System.out.println("1: List all auctions");
        System.out.println("2: List details for specific auction");
        System.out.println("3: Find auctions with a specific term in the title");
        System.out.println("4: Find auctions below a specified price");
        System.out.println("5: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
    }

    private static void printAuctions(Auction[] auctions) {
        if (auctions != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auctions");
            System.out.println("--------------------------------------------");
            for (Auction auction : auctions) {
                System.out.println(auction.currentBidToString());
            }
        }
    }

    private static void printAuction(Auction auction) {
        if (auction != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auction Details");
            System.out.println("--------------------------------------------");
            System.out.println("Id: " + auction.getId());
            System.out.println("Title: " + auction.getTitle());
            System.out.println("Description: " + auction.getDescription());
            System.out.println("User: " + auction.getUser());
            System.out.println("Current Bid: " + auction.getCurrentBid());
            System.out.println("");
        }
    }

}
