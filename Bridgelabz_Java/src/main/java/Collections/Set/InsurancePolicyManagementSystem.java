package Collections.Set;

import java.time.LocalDate;
import java.util.*;

class Policy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName,
                  LocalDate expiryDate, String coverageType,
                  double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Policy))
            return false;

        Policy p = (Policy) obj;
        return policyNumber.equals(p.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyholderName +
                " | " + expiryDate + " | " +
                coverageType + " | " + premiumAmount;
    }
}

public class InsurancePolicyManagementSystem {

    Set<Policy> hashSet = new HashSet<>();

    Set<Policy> linkedHashSet = new LinkedHashSet<>();

    Set<Policy> treeSet = new TreeSet<>(
            Comparator.comparing(Policy::getExpiryDate)
                    .thenComparing(Policy::getPolicyNumber)
    );

    List<Policy> duplicatePolicies = new ArrayList<>();

    public void addPolicy(Policy policy) {

        if (!hashSet.add(policy)) {
            duplicatePolicies.add(policy);
            System.out.println("Duplicate policy: " +
                    policy.getPolicyNumber());
            return;
        }

        linkedHashSet.add(policy);
        treeSet.add(policy);

        System.out.println("Policy added successfully");
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Unique Policies:");

        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    public void displayInsertionOrder() {
        System.out.println("\nPolicies in Insertion Order:");

        for (Policy p : linkedHashSet) {
            System.out.println(p);
        }
    }

    public void displaySortedPolicies() {
        System.out.println("\nPolicies Sorted by Expiry Date:");

        for (Policy p : treeSet) {
            System.out.println(p);
        }
    }

    public void expiringSoon() {

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("\nPolicies Expiring Within 30 Days:");

        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isBefore(today) &&
                    !p.getExpiryDate().isAfter(next30Days)) {
                System.out.println(p);
            }
        }
    }

    public void searchByCoverage(String coverage) {

        System.out.println("\nPolicies with Coverage: " + coverage);

        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }

    public void searchByPolicyNumber(String policyNumber) {

        Policy searchPolicy = new Policy(
                policyNumber, "", LocalDate.MIN, "", 0
        );

        for (Policy p : hashSet) {
            if (hashSet.contains(searchPolicy) &&
                    p.getPolicyNumber().equals(policyNumber)) {
                System.out.println("Policy Found: " + p);
                return;
            }
        }

        System.out.println("Policy Not Found");
    }

    public void displayDuplicates() {

        System.out.println("\nDuplicate Policies:");

        if (duplicatePolicies.isEmpty()) {
            System.out.println("No duplicates found");
            return;
        }

        for (Policy p : duplicatePolicies) {
            System.out.println(p);
        }
    }

    public void removePolicy(String policyNumber) {

        Policy searchPolicy = new Policy(
                policyNumber, "", LocalDate.MIN, "", 0
        );

        if (hashSet.remove(searchPolicy)) {
            linkedHashSet.remove(searchPolicy);
            treeSet.remove(searchPolicy);

            System.out.println("Policy removed successfully");
        } else {
            System.out.println("Policy not found");
        }
    }

    public static void main(String[] args) {

        InsurancePolicyManagementSystem system =
                new InsurancePolicyManagementSystem();

        system.addPolicy(new Policy(
                "P101", "Rahul", LocalDate.now().plusDays(10),
                "Health", 15000
        ));

        system.addPolicy(new Policy(
                "P102", "Priya", LocalDate.now().plusDays(45),
                "Auto", 12000
        ));

        system.addPolicy(new Policy(
                "P103", "Amit", LocalDate.now().plusDays(20),
                "Home", 18000
        ));

        system.addPolicy(new Policy(
                "P104", "Sneha", LocalDate.now().plusDays(5),
                "Health", 20000
        ));

        system.addPolicy(new Policy(
                "P101", "Rahul", LocalDate.now().plusDays(10),
                "Health", 15000
        ));

        system.displayAllPolicies();

        system.displayInsertionOrder();

        system.displaySortedPolicies();

        system.expiringSoon();

        system.searchByCoverage("Health");

        system.searchByPolicyNumber("P102");

        system.displayDuplicates();

        system.removePolicy("P103");

        system.displayAllPolicies();
    }
}