package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Auction> list() {
        return dao.list();
    }
    
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Auction get(@PathVariable int id) {
		return dao.get(id);
	}
	
	@RequestMapping(path = "", method = RequestMethod.POST)
	public Auction create(@Valid @RequestBody Auction auction) {
		return dao.create(auction);
	}
	
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false) String title_like, @RequestParam(required = false, defaultValue = "0.0") double currentBid_lte) {
    
    if (title_like != null && currentBid_lte != 0) 
    {
        return dao.searchByTitleAndPrice(title_like, currentBid_lte);
    }
    else if (title_like != null)
    {
        return dao.searchByTitle(title_like);
    }
    else if (currentBid_lte > 0)
    {
        return dao.searchByPrice(currentBid_lte);
    }
    return dao.list();
}
    
}