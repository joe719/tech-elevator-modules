-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
        
        INSERT INTO actor (first_name, last_name)
        VALUES ('HAMPTON', 'AVENUE'),('LISA', 'BYWAY');
      
        
                
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

        INSERT INTO film (title, description, release_year, language_id, length)
        VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '2008', '1', '198');
        SELECT * FROM actor WHERE actor.first_name='Hampton';
        
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
        Insert Into film_actor (actor_id, film_id)
        VALUES ('201','1001');
        
        Insert Into film_actor (actor_id, film_id)
        VALUES ('204','1001');        
        
-- 4. Add Mathmagical to the category table.

       
        INSERT into category (name)
        VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
        
        INSERT INTO film_category (film_id, category_id)
        VALUES ('1001', '17');
        
        UPDATE film_category SET category_id ='17'
        WHERE film_id ='274';
        UPDATE film_category SET category_id ='17'
        WHERE film_id ='494';
        UPDATE film_category SET category_id ='17'
        WHERE film_id ='714';
        UPDATE film_category SET category_id ='17'
        WHERE film_id ='996';
        
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
           
        UPDATE film SET rating ='G'
        WHERE film_id ='1001';
        UPDATE film SET rating ='G'
        WHERE film_id ='274';
        UPDATE film SET rating ='G'
        WHERE film_id ='494';
        UPDATE film SET rating ='G'
        WHERE film_id ='714';
        UPDATE film SET rating ='G'
        WHERE film_id ='996';

-- 7. Add a copy of "Euclidean PI" to all the stores.
        SELECT * FROM inventory;
        INSERT INTO inventory (film_id, store_id)
        VALUES ('1001', '1');
        INSERT INTO inventory (film_id, store_id)
        VALUES ('1001', '2');
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
        
        DELETE FROM film
        WHERE title='Euclidean PI';
        
-- <It did not succeed because it is referenced in other tables>
        
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)

        DELETE FROM category
        WHERE category_id='17';

-- <It did not succeed because it is referenced in other tables>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
        
        DELETE FROM film_category
        WHERE category_id='17';
        
-- <It succeeded because there is no foreign key constraint>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <deleting Mathmagical from the film_category table worked because there were no foreign key constraints, deleting Euclidean PI did not work because it still has outlying ties to other tables>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
--<it would need to be removed from inventory, to film_actor to remove the film_id from the actor_ids its tied to, and then removed from film>