package edu.cnm.deepdive.chat.model.dto;

import com.google.gson.annotations.Expose;
import java.time.Instant;
import java.util.UUID;
import retrofit2.http.Url;

public class User {

  @Expose(serialize = false, deserialize = true)
  private UUID key;

  @Expose
  private String displayName;

  @Expose
  private Url avatar;

  @Expose(serialize = false, deserialize = true)
  private Instant joined;

  public UUID getKey() {
    return key;
  }

  public void setKey(UUID key) {
    this.key = key;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Url getAvatar() {
    return avatar;
  }

  public void setAvatar(Url avatar) {
    this.avatar = avatar;
  }

  public Instant getJoined() {
    return joined;
  }

  public void setJoined(Instant joined) {
    this.joined = joined;
  }
}
