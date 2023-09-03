package no.hvl.dat250.hesol.exp1;

public class UnitConverter {
    private static final double IN_TO_METER = 0.0254;
    private static final double FT_TO_METER = 0.3048;
    private static final double MI_TO_METER = 1609.344;

    /**
     * Convert a value from one unit to another.
     *
     * @param value     The value to convert.
     * @param fromUnit  The source unit (e.g., "in", "ft", "mi", "m").
     * @param toUnit    The target unit (e.g., "in", "ft", "mi", "m").
     * @return The converted value.
     */
    public static double convert(double value, String fromUnit, String toUnit) {
        double inMeters;
        if (fromUnit.equals("in")) {
            inMeters = value * IN_TO_METER;
        } else if (fromUnit.equals("ft")) {
            inMeters = value * FT_TO_METER;
        } else if (fromUnit.equals("mi")) {
            inMeters = value * MI_TO_METER;
        } else if (fromUnit.equals("m")) {
            inMeters = value;
        } else {
            inMeters = Double.NaN;
        }

        double result;
        if (toUnit.equals("in")) {
            result = inMeters / IN_TO_METER;
        } else if (toUnit.equals("ft")) {
            result = inMeters / FT_TO_METER;
        } else if (toUnit.equals("mi")) {
            result = inMeters / MI_TO_METER;
        } else if (toUnit.equals("m")) {
            result = inMeters;
        } else {
            result = Double.NaN;
        }

        return result;
    }
}

