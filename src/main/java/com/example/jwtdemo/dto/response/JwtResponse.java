package com.example.jwtdemo.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ApiModel(subTypes = {JwtResponse.class})
public class JwtResponse {
    @ApiModelProperty(value = "Token đăng nhập", name = "token",example = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJudmh1bmcxIiwicm9sZSI6W3siYXV0aG9yaXR5IjoiQ09ORklHX1NZU1RFTSJ9LHsiYXV0aG9yaXR5IjoiQ1JFQVRFX0NFUlRJRklDQVRFIn0seyJhdXRob3JpdHkiOiJDUkVBVEVfQ0VSVElGSUNBVEVfUkVRVUVTVCJ9LHsiYXV0aG9yaXR5IjoiQ1JFQVRFX0dST1VQIn0seyJhdXRob3JpdHkiOiJDUkVBVEVfSFNNIn0seyJhdXRob3JpdHkiOiJDUkVBVEVfS0VZUEFJUiJ9LHsiYXV0aG9yaXR5IjoiQ1JFQVRFX09SR0FOSVpBVElPTiJ9LHsiYXV0aG9yaXR5IjoiQ1JFQVRFX1JPTEUifSx7ImF1dGhvcml0eSI6IkNSRUFURV9UT0tFTiJ9LHsiYXV0aG9yaXR5IjoiQ1JFQVRFX1VTRVIifSx7ImF1dGhvcml0eSI6IkRFTEVURV9DRVJUSUZJQ0FURSJ9LHsiYXV0aG9yaXR5IjoiREVMRVRFX0NFUlRJRklDQVRFX1JFUVVFU1QifSx7ImF1dGhvcml0eSI6IkRFTEVURV9HUk9VUCJ9LHsiYXV0aG9yaXR5IjoiREVMRVRFX0hTTSJ9LHsiYXV0aG9yaXR5IjoiREVMRVRFX0tFWVBBSVIifSx7ImF1dGhvcml0eSI6IkRFTEVURV9PUkdBTklaQVRJT04ifSx7ImF1dGhvcml0eSI6IkRFTEVURV9ST0xFIn0seyJhdXRob3JpdHkiOiJERUxFVEVfVE9LRU4ifSx7ImF1dGhvcml0eSI6IkRFTEVURV9VU0VSIn0seyJhdXRob3JpdHkiOiJSRUFEX0NFUlRJRklDQVRFIn0seyJhdXRob3JpdHkiOiJSRUFEX0NFUlRJRklDQVRFX1JFUVVFU1QifSx7ImF1dGhvcml0eSI6IlJFQURfR1JPVVAifSx7ImF1dGhvcml0eSI6IlJFQURfSFNNIn0seyJhdXRob3JpdHkiOiJSRUFEX0tFWVBBSVIifSx7ImF1dGhvcml0eSI6IlJFQURfTE9HIn0seyJhdXRob3JpdHkiOiJSRUFEX09SR0FOSVpBVElPTiJ9LHsiYXV0aG9yaXR5IjoiUkVBRF9ST0xFIn0seyJhdXRob3JpdHkiOiJSRUFEX1RPS0VOIn0seyJhdXRob3JpdHkiOiJSRUFEX1VTRVIifSx7ImF1dGhvcml0eSI6IlJPTEVfQURNSU4ifSx7ImF1dGhvcml0eSI6IlJPTEVfT1JHQU5JWkFUSU9OIn0seyJhdXRob3JpdHkiOiJST0xFX1NVUEVSX0FETUlOIn0seyJhdXRob3JpdHkiOiJST0xFX1VTRVIifSx7ImF1dGhvcml0eSI6IlVQREFURV9DRVJUSUZJQ0FURSJ9LHsiYXV0aG9yaXR5IjoiVVBEQVRFX0NFUlRJRklDQVRFX1JFUVVFU1QifSx7ImF1dGhvcml0eSI6IlVQREFURV9HUk9VUCJ9LHsiYXV0aG9yaXR5IjoiVVBEQVRFX0hTTSJ9LHsiYXV0aG9yaXR5IjoiVVBEQVRFX0tFWVBBSVIifSx7ImF1dGhvcml0eSI6IlVQREFURV9PUkdBTklaQVRJT04ifSx7ImF1dGhvcml0eSI6IlVQREFURV9ST0xFIn0seyJhdXRob3JpdHkiOiJVUERBVEVfVE9LRU4ifSx7ImF1dGhvcml0eSI6IlVQREFURV9VU0VSIn1dLCJleHAiOjE2Mzg2MzE5NTUsImlhdCI6MTYzODQ1OTE1NX0.Mkj6DLUvIOCa9-mvWw4dooLofbQAXSOqz2vod1qLSaeARVlCJkwDN12UJtQlUQDEV2DbgE7ubIlx6J7yuQGsqA", required = true)
    private String token;
}
