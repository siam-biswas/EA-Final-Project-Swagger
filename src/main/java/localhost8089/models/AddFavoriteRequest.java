/*
 * EAFinalProjectLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost8089.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for AddFavoriteRequest type.
 */
public class AddFavoriteRequest {
    private Content content;
    private int userId;

    /**
     * Default constructor.
     */
    public AddFavoriteRequest() {
    }

    /**
     * Initialization constructor.
     * @param  content  Content value for content.
     * @param  userId  int value for userId.
     */
    public AddFavoriteRequest(
            Content content,
            int userId) {
        this.content = content;
        this.userId = userId;
    }

    /**
     * Getter for Content.
     * @return Returns the Content
     */
    @JsonGetter("content")
    public Content getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * @param content Value for Content
     */
    @JsonSetter("content")
    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * Getter for UserId.
     * @return Returns the int
     */
    @JsonGetter("user_id")
    public int getUserId() {
        return userId;
    }

    /**
     * Setter for UserId.
     * @param userId Value for int
     */
    @JsonSetter("user_id")
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Converts this AddFavoriteRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddFavoriteRequest [" + "content=" + content + ", userId=" + userId + "]";
    }

    /**
     * Builds a new {@link AddFavoriteRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddFavoriteRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(content, userId);
        return builder;
    }

    /**
     * Class to build instances of {@link AddFavoriteRequest}.
     */
    public static class Builder {
        private Content content;
        private int userId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  content  Content value for content.
         * @param  userId  int value for userId.
         */
        public Builder(Content content, int userId) {
            this.content = content;
            this.userId = userId;
        }

        /**
         * Setter for content.
         * @param  content  Content value for content.
         * @return Builder
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * Setter for userId.
         * @param  userId  int value for userId.
         * @return Builder
         */
        public Builder userId(int userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Builds a new {@link AddFavoriteRequest} object using the set fields.
         * @return {@link AddFavoriteRequest}
         */
        public AddFavoriteRequest build() {
            return new AddFavoriteRequest(content, userId);
        }
    }
}
