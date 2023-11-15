package br.com.fabiokusaba.dslist.dto;

import br.com.fabiokusaba.dslist.entities.Game;
import org.springframework.beans.BeanUtils;

//Motivos para utilização do DTO: padronização/utilização do desenvolvimento em camadas e o
//outro motivo é que as nossas entidades podem ter associações cíclicas, ou seja, uma entidade
//aponta para a outra e a outra aponta para uma, e se tivermos uma associação cíclica na entidade
//ao tentarmos retornar na nossa API vai ocasionar um loop infinito e uma forma de controlar para
//que esse ciclo não aconteça é com a utilização de DTO
public class GameDto {
    private Long id;
    private String title;

    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDto() {
    }

    public GameDto(Game entity) {
        //Utilizando BeanUtils para copiar as propriedades da entidade para o objeto DTO
        //OBS: as propriedades devem ter o mesmo nome
        //OBS: é necessário que o DTO tenha os métodos getters e setters
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
