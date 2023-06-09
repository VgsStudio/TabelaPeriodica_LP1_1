package main.back.shared.repo;

import java.util.ArrayList;
import java.util.Arrays;

import main.back.domain.repo.RepositoryInterface;
import main.entities.Element;

public class RepositoryMock implements RepositoryInterface{
    public ArrayList<Element> elements;
    
    public RepositoryMock(){
        elements = new ArrayList<Element>(
            Arrays.asList(
                new Element(1, "Hidrogênio", "H", 0, 1, "GPRNM", 1766),
                new Element(2, "Hélio", "He", 2, 4, "GPNBG", 1868),
                new Element(3, "Lítio", "Li", 4, 7, "GPAKM", 1817),
                new Element(4, "Berílio", "Be", 6, 9, "GPAEM", 1798),
                new Element(5, "Boro", "B", 8, 11, "GPMTL", 1807),
                new Element(6, "Carbono", "C", 10, 12, "GPRNM", 0),
                new Element(7, "Nitrogênio", "N", 12, 14, "GPRNM", 1772),
                new Element(8, "Oxigênio", "O", 14, 16, "GPRNM", 1774),
                new Element(9, "Flúor", "F", 16, 19, "GPHAL", 1670),
                new Element(10, "Neônio", "Ne", 18, 20, "GPNBG", 1898),
                new Element(11, "Sódio", "Na", 20, 23, "GPAKM", 1807),
                new Element(12, "Magnésio", "Mg", 22, 24, "GPAEM", 1808),
                new Element(13, "Alumínio", "Al", 24, 27, "GPMET", 0),
                new Element(14, "Silício", "Si", 26, 28, "GPMTL", 1854),
                new Element(15, "Fósforo", "P", 28, 31, "GPRNM", 1669),
                new Element(16, "Enxofre", "S", 30, 32, "GPRNM", 0),
                new Element(17, "Cloro", "Cl", 32, 35, "GPHAL", 1774),
                new Element(18, "Argônio", "Ar", 34, 40, "GPNBG", 1894),
                new Element(19, "Potássio", "K", 36, 39, "GPAKM", 1807),
                new Element(20, "Cálcio", "Ca", 38, 40, "GPAEM", 0),
                new Element(21, "Escândio", "Sc", 40, 45, "GPTTM", 1876),
                new Element(22, "Titânio", "Ti", 42, 48, "GPTTM", 1791),
                new Element(23, "Vanádio", "V", 44, 51, "GPTTM", 1803),
                new Element(24, "Cromo", "Cr", 46, 52, "GPTTM", 0),
                new Element(25, "Manganês", "Mn", 48, 55, "GPTTM", 1774),
                new Element(26, "Ferro", "Fe", 50, 56, "GPTTM", 0),
                new Element(27, "Cobalto", "Co", 52, 59, "GPTTM", 0),
                new Element(28, "Níquel", "Ni", 54, 59, "GPTTM", 1751),
                new Element(29, "Cobre", "Cu", 56, 64, "GPTTM", 0),
                new Element(30, "Zinco", "Zn", 58, 65, "GPTTM", 1746),
                new Element(31, "Gálio", "Ga", 60, 70, "GPMET", 1875),
                new Element(32, "Germânio", "Ge", 62, 73, "GPMTL", 1886),
                new Element(33, "Arsênio", "As", 64, 75, "GPMTL", 0),
                new Element(34, "Selênio", "Se", 66, 79, "GPRNM", 1817),
                new Element(35, "Bromo", "Br", 68, 80, "GPHAL", 1826),
                new Element(36, "Criptônio", "Kr", 70, 84, "GPNBG", 1898),
                new Element(37, "Rubídio", "Rb", 72, 85, "GPAKM", 1861),
                new Element(38, "Estrôncio", "Sr", 74, 88, "GPAEM", 1790),
                new Element(39, "Ítrio", "Y", 76, 89, "GPTTM", 1794),
                new Element(40, "Zircônio", "Zr", 78, 91, "GPTTM", 1789),
                new Element(41, "Nióbio", "Nb", 80, 93, "GPTTM", 1801),
                new Element(42, "Molibdênio", "Mo", 82, 96, "GPTTM", 1778),
                new Element(43, "Tecnécio", "Tc", 84, 98, "GPTTM", 1937),
                new Element(44, "Rutênio", "Ru", 86, 101, "GPTTM", 1827),
                new Element(45, "Ródio", "Rh", 88, 103, "GPTTM", 1803),
                new Element(46, "Paládio", "Pd", 90, 106, "GPTTM", 1803),
                new Element(47, "Prata", "Ag", 92, 108, "GPTTM", 0),
                new Element(48, "Cádmio", "Cd", 94, 112, "GPTTM", 1817),
                new Element(49, "Índio", "In", 96, 115, "GPMET", 1863),
                new Element(50, "Estanho", "Sn", 98, 119, "GPMET", 0),
                new Element(51, "Antimônio", "Sb", 100, 122, "GPMTL", 0),
                new Element(52, "Telúrio", "Te", 102, 128, "GPMTL", 1782),
                new Element(53, "Iodo", "I", 104, 127, "GPHAL", 1811),
                new Element(54, "Xenônio", "Xe", 106, 131, "GPNBG", 1898),
                new Element(55, "Césio", "Cs", 108, 133, "GPAKM", 1860),
                new Element(56, "Bário", "Ba", 110, 137, "GPAEM", 1808),
                new Element(57, "Lantânio", "La", 112, 139, "GPLAN", 1839),
                new Element(58, "Cério", "Ce", 114, 140, "GPLAN", 1803),
                new Element(59, "Praseodímio", "Pr", 116, 141, "GPLAN", 1885),
                new Element(60, "Neodímio", "Nd", 118, 144, "GPLAN", 1885),
                new Element(61, "Promécio", "Pm", 120, 145, "GPLAN", 1947),
                new Element(62, "Samário", "Sm", 122, 150, "GPLAN", 1853),
                new Element(63, "Európio", "Eu", 124, 152, "GPLAN", 1901),
                new Element(64, "Gadolínio", "Gd", 126, 157, "GPLAN", 1880),
                new Element(65, "Térbio", "Tb", 128, 159, "GPLAN", 1843),
                new Element(66, "Disprósio", "Dy", 130, 163, "GPLAN", 1886),
                new Element(67, "Hólmio", "Ho", 132, 165, "GPLAN", 1878),
                new Element(68, "Érbio", "Er", 134, 167, "GPLAN", 1842),
                new Element(69, "Túlio", "Tm", 136, 169, "GPLAN", 1879),
                new Element(70, "Itérbio", "Yb", 138, 173, "GPLAN", 1878),
                new Element(71, "Lutécio", "Lu", 140, 175, "GPLAN", 1907),
                new Element(72, "Háfnio", "Hf", 142, 178, "GPTTM", 1923),
                new Element(73, "Tantálio", "Ta", 144, 181, "GPTTM", 1802),
                new Element(74, "Tungstênio", "W", 146, 184, "GPTTM", 1783),
                new Element(75, "Rênio", "Re", 148, 186, "GPTTM", 1925),
                new Element(76, "Ósmio", "Os", 150, 190, "GPTTM", 1803),
                new Element(77, "Irídio", "Ir", 152, 192, "GPTTM", 1803),
                new Element(78, "Platina", "Pt", 154, 195, "GPTTM", 0),
                new Element(79, "Ouro", "Au", 156, 197, "GPTTM", 0),
                new Element(80, "Mercúrio", "Hg", 158, 201, "GPTTM", 0),
                new Element(81, "Tálio", "Tl", 160, 204, "GPMET", 1861),
                new Element(82, "Chumbo", "Pb", 162, 207, "GPMET", 0),
                new Element(83, "Bismuto", "Bi", 164, 209, "GPMET", 0),
                new Element(84, "Polônio", "Po", 166, 209, "GPMTL", 1898),
                new Element(85, "Astato", "At", 168, 210, "GPHAL", 1940),
                new Element(86, "Radônio", "Rn", 170, 222, "GPNBG", 1900),
                new Element(87, "Frâncio", "Fr", 172, 223, "GPAKM", 1939),
                new Element(88, "Rádio", "Ra", 174, 226, "GPAEM", 1898),
                new Element(89, "Actínio", "Ac", 176, 227, "GPACT", 1899),
                new Element(90, "Tório", "Th", 178, 232, "GPACT", 1828),
                new Element(91, "Protactínio", "Pa", 180, 231, "GPACT", 1913),
                new Element(92, "Urânio", "U", 182, 238, "GPACT", 1789),
                new Element(93, "Neptúnio", "Np", 184, 237, "GPACT", 1940),
                new Element(94, "Plutônio", "Pu", 186, 244, "GPACT", 1940),
                new Element(95, "Amerício", "Am", 188, 243, "GPACT", 1944),
                new Element(96, "Cúrio", "Cm", 190, 247, "GPACT", 1944),
                new Element(97, "Berquélio", "Bk", 192, 247, "GPACT", 1949),
                new Element(98, "Califórnio", "Cf", 194, 251, "GPACT", 1950),
                new Element(99, "Einstênio", "Es", 196, 252, "GPACT", 1952),
                new Element(100, "Férmio", "Fm", 198, 257, "GPACT", 1952),
                new Element(101, "Mendelévio", "Md", 200, 258, "GPACT", 1955),
                new Element(102, "Nobélio", "No", 202, 259, "GPACT", 1957),
                new Element(103, "Laurêncio", "Lr", 204, 262, "GPACT", 1961),
                new Element(104, "Rutherfórdio", "Rf", 206, 267, "GPTTM", 1969),
                new Element(105, "Dúbnio", "Db", 208, 268, "GPTTM", 1967),
                new Element(106, "Seabórgio", "Sg", 210, 271, "GPTTM", 1974),
                new Element(107, "Bóhrio", "Bh", 212, 272, "GPTTM", 1976),
                new Element(108, "Hássio", "Hs", 214, 270, "GPTTM", 1984),
                new Element(109, "Meitnério", "Mt", 216, 276, "GPTTM", 1982),
                new Element(110, "Darmstácio", "Ds", 218, 281, "GPTTM", 1994),
                new Element(111, "Roentgênio", "Rg", 220, 280, "GPTTM", 1994),
                new Element(112, "Copernício", "Cn", 222, 285, "GPTTM", 1996),
                new Element(113, "Nihônio", "Nh", 224, 284, "GPPTM", 2003),
                new Element(114, "Flérovio", "Fl", 226, 289, "GPPTM", 1998),
                new Element(115, "Moscóvio", "Mc", 228, 288, "GPPTM", 2003),
                new Element(116, "Livermório", "Lv", 230, 293, "GPPTM", 2000),
                new Element(117, "Tenessino", "Ts", 232, 294, "GPPTM", 2010),
                new Element(118, "Oganesônio", "Og", 234, 294, "GPNBG", 2000)
            )        
        );
    }
    


    @Override
    public ArrayList<Element> getAllElements(){
        return elements;
    }

    @Override
    public Element getElement(int atomicNumber){
        for (Element element : elements) {
            if(element.getAtomicNumber() == atomicNumber){
                return element;
            }
        }
        return null;
    }

    @Override
    public Element updateElement(int atomicNumber, String info){
        for (Element element : elements) {
            if(element.getAtomicNumber() == atomicNumber){
                element.setInfo(info);
                return element;
            }
        }
        return null;
    }
}
