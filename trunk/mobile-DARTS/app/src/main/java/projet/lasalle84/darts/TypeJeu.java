package projet.lasalle84.darts;

/**
 * @file TypeJeu.java
 * @brief Déclaration de la classe TypeJeu
 * @author Menella Erwan
 */

import android.util.Log;

/**
 * @class TypeJeu
 * @brief Déclaration de la classe TypeJeu
 */
public class TypeJeu
{
    /**
     * Attributs
     */
    private boolean doubleOut;  //!< Le mode est en Double Out ?
    private int pointDepart;    //!< Point de depart du mode de jeu

    /**
     * Constantes
     */
    private final static int PARTIE_501 = 0;
    private final static int PARTIE_501_DOUBLE_OUT = 1;
    private final static int PARTIE_301 = 2;
    private final static int PARTIE_301_DOUBLE_OUT = 3;
    private final static String TAG = "TypeJeu";

    /**
     * @brief Constructeur par défaut de la classe TypeJeu
     *
     * @fn TypeJeu::TypeJeu()
     *
     */
    public TypeJeu()
    {
        this.pointDepart = 501;
        this.doubleOut = true;
    }

    /**
     * @brief Constructeur de la classe TypeJeu
     *
     * @fn TypeJeu::TypeJeu(int pointDepart, boolean doubleOut)
     * @param pointDepart
     * @param doubleOut
     */
    public TypeJeu(int pointDepart, boolean doubleOut)
    {
        this.pointDepart = pointDepart;
        this.doubleOut = doubleOut;
    }

    /**
     * @brief Constructeur de la classe TypeJeu
     *
     * @fn TypeJeu::TypeJeu(int idModeJeu)
     * @param idModeJeu l'identifiant d'un type de jeu
     */
    public TypeJeu(int idModeJeu)
    {
        switch (idModeJeu)
        {
            case PARTIE_501:
                this.pointDepart = 501;
                this.doubleOut = false;
                break;
            case PARTIE_501_DOUBLE_OUT:
                this.pointDepart = 501;
                this.doubleOut = true;
                break;
            case PARTIE_301:
                this.pointDepart = 301;
                this.doubleOut = false;
                break;
            case PARTIE_301_DOUBLE_OUT:
                this.pointDepart = 301;
                this.doubleOut = true;
                break;

        }
    }
    public int getPointDepart()
    {
        return pointDepart;
    }

    public void setPointDepart(int pointDepart)
    {
        this.pointDepart = pointDepart;
    }

    public boolean estDoubleOut()
    {
        return doubleOut;
    }

    public void setDoubleOut(boolean doubleOut)
    {
        this.doubleOut = doubleOut;
    }

    public String getTypeJeu()
    {
        String typeJeu = Integer.toString(this.getPointDepart());
        if (doubleOut)
        {
            typeJeu = typeJeu.concat("_DOUBLE_OUT");
        }
        Log.d(TAG, "getTypeJeu: "+ typeJeu);
        return typeJeu;

    }
}