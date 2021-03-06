
package cn.scau.scaubook.entity;

import java.util.List;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("t_book")
public class Book{
    @Id
    private long cid;
   	private String alt;
   	private String alt_title;
   	private List<String> author;
   	private String author_intro;
   	private String binding;
   	private String catalog;
   	private String id;
   	private String image;
   	private Images images;
   	@Name
   	private String isbn10;
   	@Name
   	private String isbn13;
   	private String origin_title;
   	private String pages;
   	private String price;
   	private String pubdate;
   	private String publisher;
   	@ColDefine(width=200)
   	private Rating rating;
   	private String subtitle;
   	@ColDefine(type=ColType.TEXT)
   	private String summary;
   	//ManyMany(target=Tags.class,key="id",to="tags",relation="t_book_tag", from = "bid")
   	@ColDefine(type=ColType.TEXT)
   	private List<Tags> tags;
   	private String title;
   	private List<String> translator;
   	private String url;

 	public String getAlt(){
		return this.alt;
	}
	public void setAlt(String alt){
		this.alt = alt;
	}
 	public String getAlt_title(){
		return this.alt_title;
	}
	public void setAlt_title(String alt_title){
		this.alt_title = alt_title;
	}
 	public List<String> getAuthor(){
		return this.author;
	}
	public void setAuthor(List<String> author){
		this.author = author;
	}
 	public String getAuthor_intro(){
		return this.author_intro;
	}
	public void setAuthor_intro(String author_intro){
		this.author_intro = author_intro;
	}
 	public String getBinding(){
		return this.binding;
	}
	public void setBinding(String binding){
		this.binding = binding;
	}
 	public String getCatalog(){
		return this.catalog;
	}
	public void setCatalog(String catalog){
		this.catalog = catalog;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getImage(){
		return this.image;
	}
	public void setImage(String image){
		this.image = image;
	}
 	public Images getImages(){
		return this.images;
	}
	public void setImages(Images images){
		this.images = images;
	}
 	public String getIsbn10(){
		return this.isbn10;
	}
	public void setIsbn10(String isbn10){
		this.isbn10 = isbn10;
	}
 	public String getIsbn13(){
		return this.isbn13;
	}
	public void setIsbn13(String isbn13){
		this.isbn13 = isbn13;
	}
 	public String getOrigin_title(){
		return this.origin_title;
	}
	public void setOrigin_title(String origin_title){
		this.origin_title = origin_title;
	}
 	public String getPages(){
		return this.pages;
	}
	public void setPages(String pages){
		this.pages = pages;
	}
 	public String getPrice(){
		return this.price;
	}
	public void setPrice(String price){
		this.price = price;
	}
 	public String getPubdate(){
		return this.pubdate;
	}
	public void setPubdate(String pubdate){
		this.pubdate = pubdate;
	}
 	public String getPublisher(){
		return this.publisher;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
 	public Rating getRating(){
		return this.rating;
	}
	public void setRating(Rating rating){
		this.rating = rating;
	}
 	public String getSubtitle(){
		return this.subtitle;
	}
	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}
 	public String getSummary(){
		return this.summary;
	}
	public void setSummary(String summary){
		this.summary = summary;
	}
 	public List<Tags> getTags(){
		return this.tags;
	}
	public void setTags(List<Tags> tags){
		this.tags = tags;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
 	public List<String> getTranslator(){
		return this.translator;
	}
	public void setTranslator(List<String> translator){
		this.translator = translator;
	}
 	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}
    @Override
    public String toString() {
        return "Book [alt="
               + alt
               + ", alt_title="
               + alt_title
               + ", author="
               + author
               + ", author_intro="
               + author_intro
               + ", binding="
               + binding
               + ", catalog="
               + catalog
               + ", id="
               + id
               + ", image="
               + image
               + ", images="
               + images
               + ", isbn10="
               + isbn10
               + ", isbn13="
               + isbn13
               + ", origin_title="
               + origin_title
               + ", pages="
               + pages
               + ", price="
               + price
               + ", pubdate="
               + pubdate
               + ", publisher="
               + publisher
               + ", rating="
               + rating
               + ", subtitle="
               + subtitle
               + ", summary="
               + summary
               + ", tags="
               + tags
               + ", title="
               + title
               + ", translator="
               + translator
               + ", url="
               + url
               + "]";
    }
	
	
}
