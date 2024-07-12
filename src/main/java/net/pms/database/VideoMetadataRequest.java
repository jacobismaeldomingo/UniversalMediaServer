/*
 * File created by Jacob Domingo - B00859343 - Dalhousie University
 *
 * This new class is added to encapsulate the parameters for the function getVideoMetadataLocalized
 * inside MediaTableVideoMetadataLocalized.java to fix the code smell "Long Parameter List" found in the method.
 * I broke down the long parameter list into small manageable object by creating this new class
 *
 * This class encapsulates the parameters needed for fetching localized video metadata.
 */

package net.pms.database;

public class VideoMetadataRequest {
    private Long id;
    private boolean fromTvSeries;
    private String language;
    private String imdbId;
    private String mediaType;
    private Long tmdbId;
    private Integer season;
    private String episode;

    // Constructor
    public VideoMetadataRequest(Long id, boolean fromTvSeries, String language, String imdbId, String mediaType, Long tmdbId, Integer season, String episode) {
        this.id = id;
        this.fromTvSeries = fromTvSeries;
        this.language = language;
        this.imdbId = imdbId;
        this.mediaType = mediaType;
        this.tmdbId = tmdbId;
        this.season = season;
        this.episode = episode;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isFromTvSeries() {
        return fromTvSeries;
    }

    public void setFromTvSeries(boolean fromTvSeries) {
        this.fromTvSeries = fromTvSeries;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Long getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(Long tmdbId) {
        this.tmdbId = tmdbId;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }
}
