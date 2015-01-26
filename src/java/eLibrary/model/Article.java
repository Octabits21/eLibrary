/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary.model;

/**
 *
 * @author Octabits
 */
public class Article {
    
    private String title;
    private User author;
    private String category;
    
    public Article (String _title, String _category, User _author) {
        this.title = _title;
        this.category = _category;
        this.author = _author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String _title) {
        this.title = _title;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String _category) {
        this.category = _category;
    }
    
}
