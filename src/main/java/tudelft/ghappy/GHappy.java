package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str != null;
        if (!str.contains("g")) return false; // Nueva condición para cadenas sin 'g'

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                // Ahora se controla si está o no en la primera posición
                if (i > 0 && str.charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }
        return true;
    }
}
