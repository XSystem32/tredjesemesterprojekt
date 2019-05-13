package reporsitory.castleRepo;

import model.Castle;

import java.util.List;

public interface CastleRepo {

    public boolean createCastle (Castle castle);
    public boolean deleteCastle (int id);
    public boolean updateCastle (Castle castle);
    Castle getCastle (int id);

    List<Castle> getCastles();
}
