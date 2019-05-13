package reporsitory.castleRepo;

import model.Castle;

import java.util.ArrayList;
import java.util.List;

public class CastleRepoImp implements CastleRepo{

    public List<String> castles = new ArrayList<>();

    public void repoInit() {
        castles.add(1, "defaultImage");
    }
    @Override
    public boolean createCastle(Castle castle) {
        return false;
    }

    @Override
    public boolean deleteCastle(int id) {
        return false;
    }

    @Override
    public boolean updateCastle(Castle castle) {
        return false;
    }

    @Override
    public Castle getCastle(int id) {
        return null;
    }

    @Override
    public List<Castle> getCastles() {
        return null;
    }
}
