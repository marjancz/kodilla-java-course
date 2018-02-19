package com.kodilla.good.patterns.challenges.Food2Door;

public class ProviderProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private RepositoryService repositoryService;

    public ProviderProductOrderService(InformationService informationService,
                                       OrderService orderService,
                                       RepositoryService repositoryService) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.repositoryService = repositoryService;
    }

    public ProviderOrderDto execute(final ProviderRequest providerRequest) {
        boolean isOrdered = orderService.process(providerRequest);

        if(isOrdered) {
            informationService.inform(providerRequest);
            repositoryService.createRepo(providerRequest);
            return new ProviderOrderDto(providerRequest.getProvider(), true);
        } else {
            return new ProviderOrderDto(providerRequest.getProvider(), false);
        }
    }
}
